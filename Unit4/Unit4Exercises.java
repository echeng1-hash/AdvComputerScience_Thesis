import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            int end = nums[nums.length - n + i];
            if (start != end) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean isFirstEven = nums[i] % 2 == 0;
            boolean isSecondEven = nums[i + 1] % 2 == 0;
            boolean isThirdEven = nums[i + 2] % 2 == 0;
            // No matter all three are even OR all three are odd, both work
            if (isFirstEven == isSecondEven && isSecondEven == isThirdEven) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int length = end - start;
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = start + i;
        }
        return numbers;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        int length = end - start;
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            int number = start + i;
            if (number % 15 == 0) {
                result[i] = "FizzBuzz";
            } else if (number % 3 == 0) {
                result[i] = "Fizz";
            } else if (number % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = number + "";
            }
        }
        return result;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] result = new int[nums.length];
        int writeIndex = 0;
        // copy evens
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        // copy odds
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return result;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= 0) {
                result.add(nums.get(i));
            }
        }
        return result;
    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i);
            if (value < 13 || value > 19) {
                result.add(value);
            }
        }
        return result;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < strs.size(); i++) {
            String newWord = strs.get(i) + "y";
            if (!newWord.contains("yy")) {
                result.add(newWord);
            }
        }
        return result;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i);
            int answer = value * value + 10;
            int lastDigit = answer % 10;
            if (lastDigit != 5 && lastDigit != 6) {
                result.add(answer);
            }
        }
        return result;
    }
}
