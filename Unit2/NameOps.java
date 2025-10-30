public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\")";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSecondSpace(String name) {
        int first = indexOfFirstSpace(name);
        if (first == -1) return -1;
        for (int i = first + 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ') return i;
        }
        return -1;
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        } 
    }

    public static String findLastName(String name) {
        int first = indexOfFirstSpace(name);
        if (first == -1) return "";
        int second = indexOfSecondSpace(name);
        if (second == -1) {
            return name.substring(first + 1);
        } else {
            return name.substring(second + 1);
        }
    }

    public static String findMiddleName(String name) {
        int first = indexOfFirstSpace(name);
        int second = indexOfSecondSpace(name);
        if (first == -1 || second == -1 || second <= first + 1) return "";
        return name.substring(first + 1, second);
    }

    public static String generateLastFirstMidInitial(String name) {
        int first = indexOfFirstSpace(name);
        if (first == -1) {
            return findFirstName(name);
        }
        int second = indexOfSecondSpace(name);
        if (second == -1) {
            return findLastName(name) + ", " + findFirstName(name);
        } else {
            String mid = findMiddleName(name);
            String initial;
            if (mid.length() == 0) {
                initial = "";
            } else {
                initial = " " + mid.substring(0, 1) + ".";
            }
            return findLastName(name) + ", " + findFirstName(name) + initial;
        }
    }
}
