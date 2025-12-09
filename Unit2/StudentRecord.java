import java.util.Arrays;

public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    public String toString() {
        return name + "'s scores: " + Arrays.toString(scores);
    }

    // public String toString() {
    // String result = name + "'s scores: ["; // start of the text
    // // loop over ONLY part of the array
    // int max = 3; // how many elements you want
    // for (int i = 0; i < max && i < scores.length; i++) {
    // result += scores[i]; // add the score
    // // add a comma *between* elements, but not after the last one
    // if (i < max - 1 && i < scores.length - 1) {
    // result += ", ";
    // }
    // }
    // result += "]"; // close the bracket
    // return result;
    // }

    // methods
    public boolean equals(StudentRecord other) {
        if (name.equals(other.name) && scores.equals(other.scores)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = sum + scores[i];
        }
        int count = last - first + 1;
        return (double) sum / count;
    }

    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber >= scores.length) {
            return -1; // indexOf when not found
        } else {
            return scores[testNumber];
        }
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (hasImproved()) {
            int start = scores.length / 2;
            return getAverage(start, scores.length - 1);
        } else {
            return getAverage(0, scores.length - 1);
        }
    }}

    // import java.util.Scanner;

    // public class UserInputExample {
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in); // Create Scanner object
    // System.out.print("Please enter your name: ");
    // String userName = scanner.nextLine(); // Read a line of text
    // System.out.print("Please enter your age: ");
    // int userAge = scanner.nextInt(); // Read an integer
    // System.out.println("Hello, " + userName + "! You are " + userAge + " years
    // old.");
    // scanner.close(); // Close the scanner
    // }
    // }

    // Declaring an array of integers
    int[] numbers;
    // Declaring an array of strings
    String[] names;
    // Allocating memory for 5 integers
    numbers=new int[5];
    // Allocating memory for 3 strings
    names=new String[3];
    // Declaring and initializing an array of integers
    int[] scores = { 70, 80, 90, 100 };
    // Declaring and initializing an array of strings
    String[] fruits = { "Apple", "Banana", "Orange"
}
;