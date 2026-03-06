import java.util.ArrayList;
import java.util.Scanner;

public class DeckAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        for (Card c : deck) {
            if (c.abilityCount() > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int count = 0;
        for (Card c : deck) {
            if (c.abilityCount() >= 1) {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }
        return true;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        boolean alreadyHasBastion = false;
        boolean alreadyHasRipple = false;
        boolean alreadyHasCleave = false;
        for (Card card : deck) {
            if (card.hasBastion()) {
                if (alreadyHasBastion) {
                    return false;
                }
                alreadyHasBastion = true;
            }
            if (card.hasRipple()) {
                if (alreadyHasRipple) {
                    return false;
                }
                alreadyHasRipple = true;
            }
            if (card.hasCleave()) {
                if (alreadyHasCleave) {
                    return false;
                }
                alreadyHasCleave = true;
            }
        }
        return true;
    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (Card card : deck) {
            int strength = card.getStrength();
            int toughness = card.getToughness();
            if (strength < 1 || strength > 5) {
                return false;
            }
            if (toughness < 1 || toughness > 5) {
                return false;
            }
            if (strength + toughness > 6) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck == null) {
            return false;
        }
        if (deck.size() != 5) {
            return false;
        }
        if (!checkOneAbilityPerCard(deck)) {
            return false;
        }
        if (!checkNoMoreThanThreeAbilityCards(deck)) {
            return false;
        }
        if (!checkNoDuplicateAbilities(deck)) {
            return false;
        }
        if (!checkStatsInRange(deck)) {
            return false;
        }
        return true;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return
    // deck
    // of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new NamedCard("A", CardType.GRANITE, 3, 3, false, false, false));
        deck.add(new NamedCard("B", CardType.PARCHMENT, 3, 3, false, false, false));
        deck.add(new NamedCard("C", CardType.BLADE, 3, 3, false, false, false));
        deck.add(new NamedCard("D", CardType.GRANITE, 3, 3, false, false, false));
        deck.add(new NamedCard("E", CardType.BLADE, 3, 3, false, false, false));
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        // TODO
        return null;
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
