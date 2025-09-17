public class StudentTester {
    public static void main(String[] args) {
        Student Student_1 = new Student("White", 11);
        System.out.println(Student_1.toSting());
        Student_1.setGrade(12);
        System.out.println(Student_1.toSting());

        Student Student_2 = new Student("Xenon", 11);
        System.out.println(Student_2.toSting());
        Student_2.setGrade(12);
        System.out.println(Student_2.toSting());

        Student Student_3 = new Student("Yellow");
        System.out.println(Student_3.toSting());
        Student_3.setGrade(9);
        System.out.println(Student_3.toSting());

        Student Student_4 = new Student("Zebra");
        System.out.println(Student_4.toSting());
        Student_4.setGrade(8);
        System.out.println(Student_4.toSting());

        // test whether having the same person will return T
        System.out.println(Student_1.equals(Student_1));
        // test whether having the different people will return F
        System.out.println(Student_1.equals(Student_2));
    }
}