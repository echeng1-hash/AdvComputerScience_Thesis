public class Unit3Exercises {
    // notes:
    // throw new Exception("Bad!");
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null) {
            return 0.0;
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                sum += strs[i].length();
                count++;
            }
        }
        return sum / count;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) {
            return "str cannot be null";
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Intended: finds the largest integer in an int array.
    public static int findMaxValue(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    // Intended: calculate the sum of the squares of the integers in the array.
    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * numbers[i];
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
