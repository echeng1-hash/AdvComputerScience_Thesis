// for-each loop syntax

// for (type variableName : arrayName) {
// code block to be executed
//}

// for loop syntax
// for (initialization; termination; increment) {
// OR for (statement 1; statement 2; statement 3) {
// code block to be executed
//}
// Statement 1 is executed (one time) before the execution of the code block.
// Statement 2 defines the condition for executing the code block.
// Statement 3 is executed (every time) after the code block has been executed.

import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    // constructor
    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    // Methods
    public double getGrade(ArrayList<String> key) {
        // required checks (to avoid NullPointerException)
        if (key == null) {
            throw new IllegalArgumentException("Key is null.");
        }
        if (getAnswers() == null) {
            throw new IllegalArgumentException("Answers is null.");
        }
        double score = 0.0;
        for (int i = 0; i < answers.size(); i++) {
            String studentAnswer = getAnswers().get(i);
            String correctAnswer = key.get(i);
            if (studentAnswer.equals("?")) {
                score += 0;
            } else if (studentAnswer.equals(correctAnswer)) {
                score += 1.0;
            } else {
                score -= 0.25;
            }
        }
        return score;
    }
}