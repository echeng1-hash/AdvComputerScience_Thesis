public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("White", 11);
        System.out.println(student1.toString());
        student1.setGrade(12);
        System.out.println(student1.toString());

        Student student2 = new Student("Xenon", 11);
        System.out.println(student2.toString());
        student2.setGrade(12);
        System.out.println(student2.toString());

        Student student3 = new Student("Yellow");
        System.out.println(student3.toString());
        student3.setGrade(9);
        System.out.println(student3.toString());

        Student student4 = new Student("Zebra");
        System.out.println(student4.toString());
        student4.setGrade(8);
        System.out.println(student4.toString());

        // test whether having the same person will return T
        System.out.println(student1.equals(student1));
        // test whether having the different people will return F
        System.out.println(student1.equals(student2));
        System.out.println(student2.getId().split("-")[1].length());
    }
}