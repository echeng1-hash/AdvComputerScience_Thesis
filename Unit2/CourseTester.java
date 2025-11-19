public class CourseTester {
    public static void main(String[] args) {
        // ---------- create some StudentRecord objects ----------
        int[] anaScores    = {90, 89, 91, 95};
        int[] billyScores  = {80, 79, 90, 90};
        int[] caseyScores  = {70, 80, 90, 100};
        StudentRecord ana   = new StudentRecord("Ana",   anaScores);
        StudentRecord billy = new StudentRecord("Billy", billyScores);
        StudentRecord casey = new StudentRecord("Casey", caseyScores);
        // ---------- test StudentRecord.toString ----------
        System.out.println("Testing StudentRecord.toString:");
        String anaExpected = "Ana's scores: [90, 89, 91, 95]";
        System.out.println("Expected: " + anaExpected);
        System.out.println("Actual:   " + ana.toString());
        System.out.println();
        // ---------- test getAverage ----------
        System.out.println("Testing getAverage(0, 3) for Ana:");
        double anaAvg = ana.getAverage(0, 3);
        System.out.println("Expected: 91.25");
        System.out.println("Actual:   " + anaAvg);
        System.out.println();
        // ---------- test getTestScore ----------
        System.out.println("Testing getTestScore for Ana:");
        System.out.println("Expected score at index 1: 89");
        System.out.println("Actual:   " + ana.getTestScore(1));
        System.out.println("Expected invalid index (10): -1");
        System.out.println("Actual:   " + ana.getTestScore(10));
        System.out.println();
        // ---------- test hasImproved and getFinalAverage ----------
        StudentRecord improver    = new StudentRecord("Imp",   new int[]{50, 60, 60, 70});
        StudentRecord notImprover = new StudentRecord("NoImp", new int[]{90, 80, 85});
        System.out.println("Testing hasImproved():");
        System.out.println("Imp scores:      50, 60, 60, 70  -> should be true");
        System.out.println("Actual:   " + improver.hasImproved());
        System.out.println("NoImp scores:    90, 80, 85      -> should be false");
        System.out.println("Actual:   " + notImprover.hasImproved());
        System.out.println();
        System.out.println("Testing getFinalAverage():");
        System.out.println("Imp (improved) -> average of top half (60, 70) = 65.0");
        System.out.println("Actual:   " + improver.getFinalAverage());
        System.out.println("NoImp (not improved) -> average of all (90, 80, 85) = 85.0");
        System.out.println("Actual:   " + notImprover.getFinalAverage());
        System.out.println();
        // ---------- create a Course ----------
        StudentRecord[] students = { ana, billy, casey };
        Course cs = new Course("Computer Science", students);
        // ---------- test Course.toString ----------
        System.out.println("Testing Course.toString:");
        String expectedCourseString =
            "== Computer Science ==\n"
            + "1.) Ana's scores: [90, 89, 91, 95]\n"
            + "2.) Billy's scores: [80, 79, 90, 90]\n"
            + "3.) Casey's scores: [70, 80, 90, 100]";
        System.out.println("Expected:\n" + expectedCourseString);
        System.out.println("Actual:\n" + cs.toString());
        System.out.println();
        // ---------- test findBestStudent ----------
        System.out.println("Testing findBestStudent():");
        System.out.println("Expected best student: Casey");
        System.out.println("Actual:   " + cs.findBestStudent());
        System.out.println();
        // ---------- test calculateTestAverage ----------
        System.out.println("Testing calculateTestAverage for test #0:");
        System.out.println("Scores on test 0: Ana(90), Billy(80), Casey(70) -> average = 80.0");
        double test0Avg = cs.calculateTestAverage(0);
        System.out.println("Actual:   " + test0Avg);
        System.out.println();
    }
}
