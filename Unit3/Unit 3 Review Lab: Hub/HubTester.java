public class HubTester {
    public static void main(String[] args) {
        Hub hub = new Hub();
        // HUB EXCEPTIONS
        // registerStudent: name is null
        try {
            hub.registerStudent(null, "pw123", "a@test.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered registerStudent's name null exception\n");
        }

        // registerStudent: password blank
        try {
            hub.registerStudent("Ana", "   ", "a@test.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered registerStudent's password blank exception\n");
        }

        // registerStudent: invalid email
        try {
            hub.registerStudent("Ana", "pw123", "notEmail");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered registerStudent's invalid email exception\n");
        }

        // registerStudent: name contains '@'
        try {
            hub.registerStudent("An@", "pw123", "a@test.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered registerStudent's name has @ exception\n");
        }

        // registerStudent: everything's fine (needed for other tests)
        Student ana = null;
        try {
            ana = hub.registerStudent("Ana", "pw123", "ana@test.com");
            System.out.println("Registered: Ana\n");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Unexpected error\n");
        }

        // registerStudent: duplicate name
        try {
            hub.registerStudent("Ana", "pw999", "ana2@test.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered registerStudent's duplicate name exception\n");
        }

        // loginStudent: blank username
        try {
            hub.loginStudent("  ", "pw123");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered loginStudent's blank username exception\n");
        }

        // loginStudent: student not found
        try {
            hub.loginStudent("Ghost", "pw123");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered loginStudent's student not found exception\n");
        }

        // loginStudent: wrong password
        try {
            hub.loginStudent("Ana", "wrong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered loginStudent's wrong password exception\n");
        }

        // doesStudentExist: blank
        try {
            hub.doesStudentExist("  ");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered doesStudentExist's blank exception\n");
        }

        // doesStudentExist: already exists
        try {
            hub.doesStudentExist("Ana");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered doesStudentExist's already exists exception\n");
        }

        // STUDENT EXCEPTIONS
        // Make a second student so I can test "name taken"
        Student bob = null;
        try {
            bob = hub.registerStudent("Bob", "pw111", "bob@test.com");
            System.out.println("Registered: Bob\n");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Unexpected error\n");
        }

        // changeName: blank
        try {
            ana.changeName("     ");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered changeName's blank exception\n");
        }

        // changeName: contains '@'
        try {
            ana.changeName("A@a");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered changeName's name has @ exception\n");
        }

        // changeName: name already taken
        try {
            ana.changeName("Bob");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered changeName's name already taken exception\n");
        }

        // resetPassword: name missing
        try {
            ana.name = "   ";
            ana.resetPassword();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered resetPassword's name missing exception\n");
        }
        // restore name
        ana.name = "Ana";

        // submitAssignment: assignments storage missing
        try {
            ana.assignments = null;
            ana.submitAssignment("HW1", "my work");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered submitAssignment's storage missing exception\n");
        }
        // restore
        ana.assignments = new Assignment[5];
        ana.assignmentCount = 0;

        // submitAssignment: title blank
        try {
            ana.submitAssignment("     ", "desc");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered submitAssignment's blank title exception\n");
        }

        // submitAssignment: description blank
        try {
            ana.submitAssignment("HW1", "  ");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered submitAssignment's blank description exception\n");
        }

        // submitAssignment: limit reached
        try {
            ana.assignments = new Assignment[2];
            ana.assignmentCount = 0;
            ana.submitAssignment("A1", "desc");
            ana.submitAssignment("A2", "desc");
            ana.submitAssignment("A3", "desc"); // should fail
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered: submitAssignment (limit reached)\n");
        }

        // ASSIGNMENT EXCEPTIONS
        // Assignment: title null
        try {
            new Assignment(null, "desc");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered Assignment constructor's title null exception\n");
        }

        // Assignment: description null
        try {
            new Assignment("HW", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered Assignment constructor's description null exception\n");
        }

        // Assignment: title blank
        try {
            new Assignment("   ", "desc");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered Assignment constructor's title blank exception\n");
        }

        // Assignment: description blank
        try {
            new Assignment("HW", "   ");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered Assignment constructor's description blank exception\n");
        }

        System.out.println("Done testing.");
    }
}
