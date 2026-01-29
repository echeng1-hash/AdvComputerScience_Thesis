public class Unit3Exercises {
    // notes:
    // throw new Exception("Bad!");
    // throw new IllegalArgumentException("n cannot be negative");

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

    // Intended: returns the $nth$ Fibonacci number, the sequence starts with 1.
    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
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

    // Intended: sorts an array in descending order.
    public static void sortArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Intended: The method takes a String,
    // creates an array of the words separated by spaces,
    // and returns the longest word in the sentence.
    // If there are words with equal lengths, it returns the first one.
    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            return "str cannot be null";
        }
        if (sentence.trim().length() == 0) {
            return "sentence cannot be empty";
        }
        String[] words = sentence.trim().split("\\s+");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    // Intended: calculates the total amount after applying interest to a principal
    // amount.
    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years <= 0) {
            return 0.0;
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    // Intended: converts a string to a positive integer.
    // If the string cannot be converted or represents a negative number, return a
    // default positive integer of 1.
    public static int parsePositiveInteger(String str) {
        try {
            int number = Integer.parseInt(str);
            if (number <= 0) {
                return 1;
            }
            return number;
        } catch (NumberFormatException e) {
            return 1;
        }
    }

    // Intended: returns an element at a specific index in an array.
    // If the index is out of bounds, return a null element.
    public static String getArrayElement(String[] arr, int index) {
        if (arr == null) {
            return "arr cannot be null";
        }
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    // Intended: calculate the square root of a number.
    // If the number is negative, return Double.NaN ("Not a Number").
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            return Double.NaN;
        }
        return Math.sqrt(number);
    }

    // Intended: calculates the sum of all elements in an int array. If the array is
    // null, it returns 0.
    public static int sumArrayElements(int[] array) {
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (NullPointerException e) {
            System.out.println("Error: array was null. Returning 0.");
            return 0;
        }
    }

    // Intended: calculates the power of a base number. If the exponent is negative,
    // return 1.
    public static double calculatePower(double base, int exponent) {
        try {
            if (exponent < 0) {
                throw new IllegalArgumentException("Exponent cannot be negative. Returning 1.");
            }
            return Math.pow(base, exponent);

        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return 1;
        }
    }
}
