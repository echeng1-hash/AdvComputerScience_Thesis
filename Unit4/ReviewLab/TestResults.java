import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    // constructor
    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        // required checks
        if (key == null) {
            throw new IllegalArgumentException("Null key.");
        }
        if (submissions == null) {
            throw new IllegalArgumentException("Null submissions.");
        }

        this.answerKey = key;
        this.submissions = submissions;
    }

    // getters and setters
    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    // Methods
    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet student : submissions) { // use for-each loop to convenience submissions
            student.setTestScore(student.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }
        String bestName = submissions.get(0).getName();
        // submissions.get(0) means the first StudentAnswerSheet in the list
        // .getName() means getting the student’s name
        // So bestName starts as the first student’s name
        double bestScore = submissions.get(0).getGrade(answerKey);
        // similar to above, but getting the first student’s score
        for (StudentAnswerSheet student : submissions) {
            double score = student.getGrade(answerKey);
            // student = one StudentAnswerSheet from the submissions list (in the for-each
            // loop)
            // getGrade(answerKey) = “grade this student’s answers using the correct answer
            // key”
            if (score > bestScore) {
                bestScore = score;
                bestName = student.getName();
            }
            // only update if it's higher so ties keep the first student
        }
        return bestName;
    }
}
