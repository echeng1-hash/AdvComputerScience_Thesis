// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null.");
        }
        // any negative stat is no
        if (monster.getHealth() < 0 || monster.getAttack() < 0 || monster.getDefense() < 0 || monster.getSpeed() < 0) {
            return false;
        }
        // not exceed 250
        return monster.getTotalStatSum() <= 250;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null.");
        }
        ElementType element = monster.getElement();
        if (element == ElementType.FIRE || element == ElementType.WATER || element == ElementType.EARTH
                || element == ElementType.AIR) {
            return true;
        }
        // If element is invalid, assign a safe default
        monster.setElement(ElementType.FIRE);
        return false;
    }

    // to-do: correctStats
    // checks if stats are invalid
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null.");
        }
        // remove negative values
        if (monster.getHealth() < 0) {
            monster.setHealth(0);
        }
        if (monster.getAttack() < 0) {
            monster.setAttack(0);
        }
        if (monster.getDefense() < 0) {
            monster.setDefense(0);
        }
        if (monster.getSpeed() < 0) {
            monster.setSpeed(0);
        }
        // reduce stats until total <= 250
        while (monster.getTotalStatSum() > 250) {
            // reduce the largest stat by 1 each time
            int health = monster.getHealth();
            int attack = monster.getAttack();
            int defense = monster.getDefense();
            int speed = monster.getSpeed();
            if (health >= attack && health >= defense && health >= speed && health > 0) {
                monster.setHealth(health - 1);
            } else if (attack >= defense && attack >= speed && attack > 0) {
                monster.setAttack(attack - 1);
            } else if (defense >= speed && defense > 0) {
                monster.setDefense(defense - 1);
            } else if (speed > 0) {
                monster.setSpeed(speed - 1);
            } else {
                // if everything is already 0
                break;
            }
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0.
    // It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (monster1 == null || monster2 == null) {
            throw new IllegalArgumentException("Monsters cannot be null.");
        }
        // validate elements
        boolean monster1ElementValid = validateElement(monster1);
        boolean monster2ElementValid = validateElement(monster2);
        // validate stats
        boolean monster1StatsValid = validateStats(monster1);
        boolean monster2StatsValid = validateStats(monster2);
        boolean monster1Valid = monster1ElementValid && monster1StatsValid;
        boolean monster2Valid = monster2ElementValid && monster2StatsValid;
        // both invalid, return null
        if (!monster1Valid && !monster2Valid) {
            return null;
        }
        // only one is invalid, the other wins
        if (!monster1Valid) {
            System.out.println(monster2.getName() + " wins.");
            System.out.println(monster2.victoryNoise());
            return monster2;
        }
        if (!monster2Valid) {
            System.out.println(monster1.getName() + " wins.");
            System.out.println(monster1.victoryNoise());
            return monster1;
        }
        // decide who goes first by speed
        Monster firstAttacker = monster1;
        Monster secondAttacker = monster2;
        if (monster2.getSpeed() > monster1.getSpeed()) {
            firstAttacker = monster2;
            secondAttacker = monster1;
        } else if (monster2.getSpeed() == monster1.getSpeed()) { // if speed the samee, random assign
            if (Math.random() <= 0.5) {
                firstAttacker = monster2;
                secondAttacker = monster1;
            }
        }
        // Alternate turns
        while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
            firstAttacker.attack(secondAttacker);
            displayStatus(monster1, monster2);
            if (monster1.getHealth() <= 0 || monster2.getHealth() <= 0) {
                break;
            }
            secondAttacker.attack(firstAttacker);
            displayStatus(monster1, monster2);
        }
        // Decide winner
        Monster winner;
        if (monster1.getHealth() > 0) {
            winner = monster1;
        } else {
            winner = monster2;
        }
        System.out.println(winner.getName() + " wins.");
        System.out.println(winner.victoryNoise());
        return winner;
    }

    // to-do: battleEveryone
    // method battles monsters found in an ArrayList.
    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        if (monsters == null) {
            throw new IllegalArgumentException("Monster list cannot be null.");
        }
        if (monsters.size() == 0) {
            throw new IllegalArgumentException("Monster list cannot be empty.");
        }
        // store original health values for each monster
        ArrayList<Integer> originalHealthValues = new ArrayList<Integer>();
        for (Monster monster : monsters) {
            if (monster == null) {
                throw new IllegalArgumentException("Monster list cannot contain null.");
            }
            originalHealthValues.add(monster.getHealth());
        }
        Monster currentWinner = monsters.get(0);
        for (int index = 1; index < monsters.size(); index = index + 1) {
            Monster challenger = monsters.get(index);// get first one, and get battle everyone
            Monster battleWinner = startBattle(currentWinner, challenger); // battle the next one in the monster array
                                                                           // list
            currentWinner = battleWinner;
            // reset winner health (from the tournament list)
            int winnerOriginalHealth = findOriginalHealth(monsters, originalHealthValues, currentWinner);// write helper
                                                                                                         // method later
                                                                                                         // on
            currentWinner.setHealth(winnerOriginalHealth);
            // winner makes victory noise (the instructions say it should happen here too)
            System.out.println(currentWinner.victoryNoise());
        }
        return currentWinner;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        // System.out.println("Chimney the Chimera: 50 health vs Truant the Treant: 10
        // health");
        if (monster == null || opponent == null) {
            throw new IllegalArgumentException("Monsters cannot be null.");
        }
        int monsterHealth = monster.getHealth();
        int opponentHealth = opponent.getHealth();
        if (monsterHealth < 0)
            monsterHealth = 0;
        if (opponentHealth < 0)
            opponentHealth = 0;
        System.out.println(monster.getName() + ": " + monsterHealth + "health vs " + opponent.getName() + ": "
                + opponentHealth + "health");
    }

    // helper method
    private static int findOriginalHealth(ArrayList<Monster> monsters, ArrayList<Integer> originalHealthValues,
            Monster winner) { // originalHealthValues match monsters one by one
        for (int index = 0; index < monsters.size(); index = index + 1) {
            if (monsters.get(index) == winner) {
                return originalHealthValues.get(index);
            }
        }
        // if cannot find it, just return current health
        return winner.getHealth();
    }
}
