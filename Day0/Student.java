public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.id = generateId();
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
        this.id = generateId();
        this.grade = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toSting() {
        return name + " is a " + grade 
                + "th grade student. Their id is " + id;
    }

    public Boolean equals(Student other) {
        if (this.name.equals(other.name) 
            && this.id.equals(other.id) 
            && this.grade == other.grade) {
            return true;
        } else {
            return false;
        }
    }

    public String generateId() {
        String id = "";
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        id += "-";
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        return id;
    }
}
