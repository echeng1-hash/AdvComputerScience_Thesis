public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int computeTotalEmployees() {
        int totalNumOfEmployees = numberOfLoanOfficers + numberOfTellers;
        return totalNumOfEmployees;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers 
                + " loan officers and " + numberOfTellers + " of tellers.";
    }

    public boolean equals(Bank other) {
        if (numberOfLoanOfficers == other.numberOfLoanOfficers 
            && numberOfTellers == other.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (numberToHire < 0) {
            return; 
        }
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    public double getEmployeeRatio() {
        double ratio = numberOfLoanOfficers / numberOfTellers;
        return ratio;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (numberToFire < 0) {
            return; 
        }
        if (isLoanOfficer) {
            numberOfLoanOfficers -= numberToFire;
        } else {
            numberOfTellers -= numberToFire;
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (numberOfLoanOfficers >= numberOfTellers) {
            numberOfLoanOfficers -= 1;
            numberOfTellers += 1;
        } else if (numberOfTellers >= numberOfLoanOfficers) {
            numberOfLoanOfficers += 1;
            numberOfTellers -= 1;
        }
    }

    public int totalSalary() {
        int salary = numberOfLoanOfficers * 7500 + numberOfTellers * 45000;
        return salary;
    }
}
