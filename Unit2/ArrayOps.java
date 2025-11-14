public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        if (array == null) {
            System.out.println("[]");
            return "[]";
        }
        String out = "[";
        for (int i = 0; i < array.length; i++) {
            out += array[i]; // prints "null" for null elements
            if (i != array.length - 1) {
                out += ", ";
            }
        }
        out += "]";
        System.out.println(out);
        return out;
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and
     * enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        if (array == null) {
            System.out.println("[]");
            return "[]";
        }
        String out = "[";
        for (int i = 0; i < array.length; i++) {
            out += array[i]; // prints "null" for null elements
            if (i != array.length - 1) {
                out += ", ";
            }
        }
        out += "]";
        System.out.println(out);
        return out;
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one that
     * appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        int start = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                start = i;
                break;
            }
        }
        if (start == -1) {
            return null;
        }
        String longest = array[start];
        int longestLen = longest.length();
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] != null) {
                int len = array[i].length();
                if (len > longestLen) {
                    longestLen = len;
                    longest = array[i];
                }
            }
        }
        return longest;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                sum = sum + array[i].length();
                count = count + 1;
            }
        }
        if (count == 0) {
            return 0.0;
        } else {
            return (double) sum / count;
        }
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the
     * frequency of a letter in the alphabet. The first element (index 0) represents
     * the frequency of the letter 'a', the second element (index 1) represents the
     * frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input
     *         string.
     */
    public static int[] countLetterFrequencies(String input) {
        int[] freq = new int[26];
        if (input == null) {
            return new int[0];
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                freq[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        return freq;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by
     * one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        if (array == null) {
            return new int[0];
        }
        if (index < 0 || index >= array.length) {
            return array;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        if (array.length > 0) {
            array[array.length - 1] = 0;
        }
        return array;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int newLen = array.length * 2;
        int[] bigger;
        if (newLen == 0) {
            bigger = new int[0];
        } else {
            bigger = new int[newLen];
        }
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }

        return bigger;
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of
     * each
     * String in the array.
     * For example, if the array contained: {"Hello", "my", "name", "is", "Larry"},
     * then this method would return an array with the contents:
     * {"#0 Hello", "#1 my", "#2 name", "#3 is", "#4 Larry"}.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added to
     *         each String
     */
    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            return new String[0];
        }
        String[] out = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                out[i] = null;              // keep nulls as null
            } else {
                out[i] = "#" + i + " " + array[i];
            }
        }
        return out;
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] rev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rev[i] = array[array.length - 1 - i];
        }
        return rev;
    }

}
