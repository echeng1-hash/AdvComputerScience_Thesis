public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\")";
    }

    public static String whoIsAwesome(String name) {
        return name + "is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        for (int i = 0; 1 < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSecondSpace(String name) {
        int first = indexOfFirstSpace(name);
        if (first == -1) {
            return -1;
        } else {
            return indexOfFirstSpace(name.substring(first));
        }
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        } 
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return "";
        } else if (indexOfSecondSpace(name) == -1) {
            return name.substring(indexOfFirstSpace(name));
        } else {
            return name.substring(indexOfSecondSpace(name));
        } 
    }

    public static String findMiddleName(String name) {
        if (indexOfSecondSpace(name) != -1) {
            return name.substring(indexOfFirstSpace(name), indexOfSecondSpace(name));
        } else {
            return "";
        } 
    }

    public static String generateLastFirstMidInitial(String name) {
       if (indexOfFirstSpace(name) == -1) {
            return findFirstName(name);
        } else if (indexOfSecondSpace(name) == -1) {
            return findLastName(name) + ", " + findFirstName(name);
        } else {
            return findLastName(name) + ", " + findFirstName(name) 
                + findMiddleName(name).substring(0, 1) + ".";
        } 
    }
}
