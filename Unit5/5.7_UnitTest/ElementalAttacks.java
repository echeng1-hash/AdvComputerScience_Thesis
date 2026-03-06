public interface ElementalAttacks {

    // to-do: Implement the attack method for ElementalAttacks
    // Every monster has 2 different attacks, each with different damage and type.
    // There is a 45% chance the monster should use AttackOne
    // There is a 45% chance the monster should use AttackTwo
    // There is a 10% chance the monster doubles down and uses BOTH attacks with
    // doubleDown Attack
    // - The double down attack is only available once per battle.
    // - After using double down, the attack probability is 50% / 50% for Attacks
    // 1/2
    default void attack(Monster opponent) {
        if (opponent == null) {
            throw new IllegalArgumentException("Opponent cannot be null.");
        }
        Monster self = (Monster) this;
        double roll = Math.random(); // 0-1
        if (!self.hasUsedDoubleDown()) {
            if (roll < 0.45) {
                performSingleElementalAttack(1, opponent);
            } else if (roll < 0.90) {
                performSingleElementalAttack(2, opponent);
            } else {
                performDoubleDownAttack(opponent);
            }
        } else { // after double down
            if (roll < 0.50) {
                performSingleElementalAttack(1, opponent);
            } else {
                performSingleElementalAttack(2, opponent);
            }
        }
    }

    // to-do: Implement the attack method for performSingleElementalAttack
    // The current moster attacks the opponent using the attackNumber provided
    default void performSingleElementalAttack(int attackNumber, Monster opponent) {
        if (opponent == null) {
            throw new IllegalArgumentException("Opponent cannot be null.");
        }
        if (attackNumber != 1 && attackNumber != 2) {
            throw new IllegalArgumentException("attackNumber must be 1 or 2.");
        }
        Monster attacker = this.Monster;
        String attackName;
        ElementType attackElement;
        if (attackNumber == 1) {
            attackName = attacker.attackNameOne;
            attackElement = attacker.attackElementOne;
        } else {
            attackName = attacker.attackNameTwo;
            attackElement = attacker.attackElementTwo;
        }
        System.out.println(attacker.getName() + " used " + attackName + "!");

        // STAB
        double stabMultiplier = 1.0;
        if (attackElement == attacker.getElement()) {
            stabMultiplier = 1.5;
        }
        // fire, air, earth, water, fire
        double effectivenessMultiplier = getEffectivenessMultiplier(attackElement.getDisplayName(),
                opponent.getElement().getDisplayName());
        if (effectivenessMultiplier == 2.0) {
            System.out.println("It was super effective.");
        } else if (effectivenessMultiplier == 0.5) {
            System.out.println("It was not very effective.");
        }
        // damage calculation
        int baseDamage = 10;
        if (opponent.getDefense() <= 0) {
            throw new IllegalArgumentException("Opponent defense must be positive.");
        }
        double attackOverDefense = (double) attacker.getAttack() / (double) opponent.getDefense();
        double totalDamage = baseDamage * attackOverDefense * stabMultiplier * effectivenessMultiplier;
        // critical hit
        if (didAttackCrit(attacker.getSpeed())) {
            System.out.println("It was a critical hit.");
            totalDamage = totalDamage * 2.0;
        }
        // convert to int damage (at least 1)
        int finalDamage = (int) Math.round(totalDamage);
        if (finalDamage < 1) {
            finalDamage = 1;
        }
        opponent.takeDamage(finalDamage);
    }

    // to-do: Implement the useDoubleDown() method for the monster
    // This method is called when the monster uses their double down attack.
    // The double down attack is only available once per battle
    // If the monster has already used their double down attack, print a message
    // saying so and
    // return. The
    // monster effectively loses their turn.
    default void performDoubleDownAttack(Monster opponent) {
        if (opponent == null) {
            throw new IllegalArgumentException("Opponent cannot be null.");
        }
        Monster attacker = this.Monster;
        if (attacker.hasUsedDoubleDown()) {
            System.out.println(attacker.getName() + " already used Double Down.");
            return; // loses the turn
        }
        attacker.useDoubleDown();
        System.out.println(attacker.getName() + " used Double Down.");
        // use both attacks
        performSingleElementalAttack(1, opponent);
        // if already defeated, don't do attack 2
        if (opponent.getHealth() > 0) {
            performSingleElementalAttack(2, opponent);
        }
    }

    // to-do: didAttackCrit
    // returns a boolean if an attack critically struck based on the speed of the
    // attacking monster
    public static boolean didAttackCrit(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
        double critChance = (double) speed / 250.0;
        return Math.random() < critChance;
    }

    /**
     * Returns true if attackType is super effective against defenderType.
     * Fire->Air, Air->Earth, Earth->Water, Water->Fire
     */
    static boolean isSuperEffectiveAgainst(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return false;
        return (attackType == ElementType.FIRE && defenderType == ElementType.AIR)
                || (attackType == ElementType.AIR && defenderType == ElementType.EARTH)
                || (attackType == ElementType.EARTH && defenderType == ElementType.WATER)
                || (attackType == ElementType.WATER && defenderType == ElementType.FIRE);
    }

    /**
     * Returns the effectiveness multiplier: 2.0 (super), 1.0 (normal), or 0.5
     * (low).
     */
    static double getElementalMultiplier(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return 1.0;
        if (isSuperEffectiveAgainst(attackType, defenderType))
            return 2.0;
        if ((attackType == ElementType.FIRE && (defenderType == ElementType.WATER || defenderType == ElementType.FIRE))
                || (attackType == ElementType.WATER
                        && (defenderType == ElementType.EARTH || defenderType == ElementType.WATER))
                || (attackType == ElementType.EARTH
                        && (defenderType == ElementType.AIR || defenderType == ElementType.EARTH))
                || (attackType == ElementType.AIR
                        && (defenderType == ElementType.FIRE || defenderType == ElementType.AIR)))
            return 0.5;
        return 1.0;
    }
}
