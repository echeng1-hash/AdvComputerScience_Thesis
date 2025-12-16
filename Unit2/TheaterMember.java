public class TheaterMember {
    // Instance Variables
    private String name;
    private boolean[] loyaltyCredits;

    // constructor
    public TheaterMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    // methods
    public void grantLoyaltyCredit() {
        loyaltyCredits[0] = true;
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count++;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        if (countLoyaltyCredits() >= 6) {
            return "Gold Member";
        } else if (countLoyaltyCredits() >= 3 && countLoyaltyCredits() <= 5) {
            return "Silver Member";
        } else if (countLoyaltyCredits() < 3) {
            return "Plus Member";
        } else {
            return "";
        }
    }

    public String loyaltyHistory() {
        String result = "Loyalty History: [";
        for (int i = 0; i < countLoyaltyCredits() + 1; i++) {
            result += "X";
            if (i < countLoyaltyCredits() + 1 - 1) {
                result += ", ";
            }
        }
        for (int i = countLoyaltyCredits(); i < countLoyaltyCredits() + 1; i++) {
            result += "-";
            if (i < countLoyaltyCredits() + 1 - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public String toString() {
        return name + "(" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (name.equals(other.name) && loyaltyCredits.equals(other.loyaltyCredits)) {
            return true;
        } else {
            return false;
        }
    }
}
