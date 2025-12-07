public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
    }

    // getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods
    public String toString() {
        String result = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            StudentRecord s = enrolledStudents[i];
            // number and name
            result = result + (i + 1) + ".) " + s.getName() + "'s scores: ";
            // scores in [a, b, c] format
            int[] scores = s.getScores();
            result = result + "[";
            for (int j = 0; j < scores.length; j++) {
                result = result + scores[j];
                if (j < scores.length - 1) {
                    result = result + ", ";
                }
            }
            result = result + "]\n";
        }
        return result;
    }

    // methods
    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    public String findBestStudent() {
        // if (enrolledStudents == null || enrolledStudents.length == 0) {
        // return "";
        // }
        String bestName = enrolledStudents[0].getName();
        double bestAvg = enrolledStudents[0].getFinalAverage();
        for (int i = 1; i < enrolledStudents.length; i++) {
            double currentAvg = enrolledStudents[i].getFinalAverage();
            if (currentAvg > bestAvg) {
                bestAvg = currentAvg;
                bestName = enrolledStudents[i].getName();
            }
        }
        return bestName;
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage
    public double calculateTestAverage(int testNumber) {
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            int score = enrolledStudents[i].getTestScore(testNumber);
            // getTestScore returns -1 if that test does not exist
            if (score != -1) {
                sum = sum + score;
                count = count + 1;
            }
        }
        if (count == 0) {
            return 0.0;
        } else {
            return sum / count;
        }
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null
                    && enrolledStudents[i].getName().equals(student.getName())) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] newArr = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newArr[i] = enrolledStudents[i];
        }
        enrolledStudents = newArr;
    }
}
