public class Unit3ExercisesTester {
    public static void main(String[] args) {
        // testCalculateStringLengthAverage();
        // Test Case 1 - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case 2 - Edge Case: Null element in array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case 3 - Edge Case: Null array (should throw exception)
        try {
            letters = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended.");
        }

        // testReverseString();
        // Test Case 1 - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case 2 - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case 3 - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case 4 - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

        // testFindMaxValue();
        // 1) Main Case - only positive integers
        int[] nums = { 3, 7, 2, 9, 5 };
        System.out.println("Expected 9: " + Unit3Exercises.findMaxValue(nums));
        // 2) Edge Case - negatives and zero
        nums = new int[] { -4, 0, -2, -9 };
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(nums));
        // 3) Edge Case - only negatives
        nums = new int[] { -10, -3, -50, -7 };
        System.out.println("Expected -3: " + Unit3Exercises.findMaxValue(nums));
        // 4) Edge Case - null array (should throw exception)
        try {
            nums = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(nums));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended.");
        }

        // testIsPalindrome();
        // 1) Main Case - palindrome string
        String testString2 = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString2));
        // 2) Main Case - non-palindrome string
        testString2 = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString2));
        // 3) Edge Case - null string (should throw exception)
        try {
            testString2 = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended.");
        }
        // 4) Edge Case - empty string
        testString2 = "";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString2));

        // testSumEvenNumbers();
        // 1) Main Case - positive even and odd integers
        int[] nums2 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Expected 12: " + Unit3Exercises.sumEvenNumbers(nums2));
        // 2) Edge Case - only negative even and odd integers
        nums2 = new int[] { -1, -2, -3, -4, -5, -6 };
        System.out.println("Expected -12: " + Unit3Exercises.sumEvenNumbers(nums2));
        // 3) Edge Case - both positive and negative even and odd integers
        nums2 = new int[] { -2, 7, 0, 5, 8, -4 };
        System.out.println("Expected 2: " + Unit3Exercises.sumEvenNumbers(nums2));
        // 4) Edge Case - null array (should throw exception)
        try {
            nums2 = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(nums2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended.");
        }

        // testCalculateSumOfSquares();
        // 1) Main Case - positive integers
        int[] nums3 = { 1, 2, 3, 4 };
        System.out.println("Expected 30: " + Unit3Exercises.calculateSumOfSquares(nums3));
        // 2) Edge Case - negative integers
        nums3 = new int[] { -1, -2, -3, -4 };
        System.out.println("Expected 30: " + Unit3Exercises.calculateSumOfSquares(nums3));
        // 3) Edge Case - mix of positive and negative integers
        nums3 = new int[] { -1, 2, -3, 4 };
        System.out.println("Expected 30: " + Unit3Exercises.calculateSumOfSquares(nums3));
        // 4) Edge Case - null array (should throw exception)
        try {
            nums3 = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(nums3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended.");
        }

        // testGetNthFibonacci();
        // 1) Main Case - test at least 2 values (compute by hand)
        // Fibonacci starting with 1: 0, 1, 1, 2, 3, 5, 8, ...
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(5));
        System.out.println("Expected 8: " + Unit3Exercises.getNthFibonacci(6));
        // 2) Edge Case - negative n (should throw exception)
        try {
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(-3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when n was negative, as intended.");
        }

    }
}
