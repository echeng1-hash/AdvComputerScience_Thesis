public class Unit3ExercisesTester {
    public static void main(String[] args) {
        // testCalculateStringLengthAverage();
        // Test Case 1 - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case 2 - Edge Case: Null element in array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case 3 - Edge Case: Null array
        try {
            letters = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null.");
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
            System.out.println("The method threw an exception when the string was null.");
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
        // 4) Edge Case - null array
        try {
            nums = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(nums));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null.");
        }

        // testIsPalindrome();
        // 1) Main Case - palindrome string
        String testString2 = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString2));
        // 2) Main Case - non-palindrome string
        testString2 = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString2));
        // 3) Edge Case - null string
        try {
            testString2 = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null.");
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
        // 4) Edge Case - null array
        try {
            nums2 = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(nums2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null.");
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
        // 4) Edge Case - null array
        try {
            nums3 = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(nums3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null.");
        }

        // testGetNthFibonacci();
        // 1) Main Case - test at least 2 values
        // Fibonacci starting with 1: 0, 1, 1, 2, 3, 5, 8, ...
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(5));
        System.out.println("Expected 8: " + Unit3Exercises.getNthFibonacci(6));
        // 2) Edge Case - negative n
        try {
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(-3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when n was negative.");
        }

        // testSortArrayDescending();
        // 1) Main Case - unsorted array
        int[] arr = { 3, 1, 7, 4, 2 };
        Unit3Exercises.sortArrayDescending(arr);
        System.out.print("Expected [7, 4, 3, 2, 1]: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 2) Edge Case - array with negative numbers
        arr = new int[] { -1, -5, 3, 0, -2 };
        Unit3Exercises.sortArrayDescending(arr);
        System.out.print("Expected [3, 0, -1, -2, -5]: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 3) Edge Case - null array
        try {
            arr = null;
            Unit3Exercises.sortArrayDescending(arr);
            System.out.println("Expected exception (but none was thrown).");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null.");
        }

        // testFindLongestWord();
        // 1) Main Case - normal array of strings
        String sentence = "I like pineapple pizza";
        System.out.println("Expected pineapple: " + Unit3Exercises.findLongestWord(sentence));
        String sentence2 = "What if I quit?";
        System.out.println("Expected What: " + Unit3Exercises.findLongestWord(sentence2));
        // 2) Main Case - tie case (should return first one)
        sentence = "cat dog";
        System.out.println("Expected cat: " + Unit3Exercises.findLongestWord(sentence));
        // 3) Edge Case - null input
        try {
            sentence = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the sentence was null.");
        }
        // 4) Edge Case - only spaces
        try {
            sentence = "   ";
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the sentence was empty.");
        }

        // testCalculateInterest();
        // 1) Main Case - everything regular
        System.out.println("Expected 110.25: " + Unit3Exercises.calculateInterest(100.0, 5.0, 2));
        System.out.println("Expected 266.2: " + Unit3Exercises.calculateInterest(200.0, 10.0, 3));
        // 2) Edge Case - negative principal
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(-50.0, 5.0, 2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception for negative principal.");
        }
        // 3) Edge Case - negative rate
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(100.0, -2.0, 2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception for negative rate.");
        }
        // 4) Edge Case - years not positive
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(100.0, 5.0, -1));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception for non-positive years.");
        }

        // testParsePositiveInteger();
        // 1) valid number
        String str = "42";
        System.out.println("Expected 42: " + Unit3Exercises.parsePositiveInteger(str));
        // 2) invalid number string
        str = "abc";
        System.out.println("Expected 1: " + Unit3Exercises.parsePositiveInteger(str));
        // 3) negative number string
        str = "-5";
        System.out.println("Expected 1: " + Unit3Exercises.parsePositiveInteger(str));
        // 4) zero
        str = "0";
        System.out.println("Expected 1: " + Unit3Exercises.parsePositiveInteger(str));

        // testGetArrayElement();
        // 1) valid index
        String[] arr3 = { "a", "b", "c", "d", "e" };
        System.out.println("Expected c: " + Unit3Exercises.getArrayElement(arr3, 2));
        // 2) out of bounds (too high)
        System.out.println("Expected null: " + Unit3Exercises.getArrayElement(arr3, 10));
        // 3) out of bounds (negative)
        System.out.println("Expected null: " + Unit3Exercises.getArrayElement(arr3, -1));
        // 4) null array
        try {
            arr3 = null;
            System.out.println("Expected exception: " + Unit3Exercises.getArrayElement(arr3, 0));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Exception for testing purposes.");
        }

        // testCalculateSquareRoot();
        // 1) positive number
        int number = 25;
        System.out.println("Expected 5.0: " + Unit3Exercises.calculateSquareRoot(number));
        // 2) zero
        number = 0;
        System.out.println("Expected 0.0: " + Unit3Exercises.calculateSquareRoot(number));
        // 3) negative number (tester uses try/catch)
        try {
            number = -9;
            if (number < 0) {
                throw new IllegalArgumentException(
                        "Cannot calculate square root of a negative number. Returning " + Double.NaN);
            }
            System.out.println("Expected NaN: " + Unit3Exercises.calculateSquareRoot(number));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Exception for testing purposes.");
        }

        // testSumArrayElements();
        // 1) normal array
        int[] arr4 = { 1, 2, 3, 4 };
        System.out.println("Expected 10: " + Unit3Exercises.sumArrayElements(arr4));
        // 2) includes negatives
        arr4 = new int[] { -2, 5, -3 };
        System.out.println("Expected 0: " + Unit3Exercises.sumArrayElements(arr4));
        // 3) empty array
        arr4 = new int[] {};
        System.out.println("Expected 0: " + Unit3Exercises.sumArrayElements(arr4));
        // 4) null array (method should catch and return 0)
        arr4 = null;
        System.out.println("Expected 0: " + Unit3Exercises.sumArrayElements(arr4));

        // testCalculatePower();
        // 1) normal exponent
        System.out.println("Expected 8.0: " + Unit3Exercises.calculatePower(2.0, 3));
        // 2) exponent 0
        System.out.println("Expected 1.0: " + Unit3Exercises.calculatePower(5.0, 0));
        // 3) negative exponent
        System.out.println("Expected 1.0: " + Unit3Exercises.calculatePower(2.0, -4));
    }
}
