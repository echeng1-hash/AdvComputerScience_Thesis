public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        // 0 = Sun, 1 = Mon, ... 6 = Sat
        boolean weekend = (day == 0 || day == 6);
        if (!vacation) {
            if (weekend) {
                return "10:00";
            } else {
                return "7:00";
            }
        } else {
            if (weekend) {
                return "off";
            } else {
                return "10:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        if (str.length() == 0) {
            return str;
        }
        String start = str.substring(0, 1);
        String end = str.substring(str.length() - 1);
        if (start.equals("f") && end.equals("b")) {
            return "FizzBuzz";
        } else if (end.equals("b")) {
            return "Buzz";
        } else if (start.equals("f")) {
            return "Fizz";
        } else {
            return str;
        }
    }

    public static String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            newStr += ch;
            newStr += ch;
        }
        return newStr;
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                cat++;
            }
            if (sub.equals("dog")) {
                dog++;
            }
        }
        return cat == dog;
    }

    public static String mixString(String a, String b) {
        String result = "";
        int minLen = Math.min(a.length(), b.length());
        for (int i = 0; i < minLen; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }
        if (a.length() > minLen) {
            result += a.substring(minLen);
        }
        if (b.length() > minLen) {
            result += b.substring(minLen);
        }
        return result;
    }

    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += end;
        }
        return result;
    }

    public static boolean endOther(String a, String b) {
        String lowerCamelCase1 = a.toLowerCase();
        String lowerCamelCase2 = b.toLowerCase();
        if (lowerCamelCase1.length() < lowerCamelCase2.length()) {
            int start = lowerCamelCase2.length() - lowerCamelCase1.length();
            String tail = lowerCamelCase2.substring(start);
            if (tail.equals(lowerCamelCase1)) {
                return true;
            } else {
                return false;
            }
        } else {
            int start = lowerCamelCase1.length() - lowerCamelCase2.length();
            String tail = lowerCamelCase1.substring(start);
            if (tail.equals(lowerCamelCase2)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c'
                    && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2;
            } else {
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[index] = 0;
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                result[index] = words[i];
                index++;
            }
        }
        return result;
    }

    public static int scoresAverage(int[] scores) {
        int half = scores.length / 2;
        int sum1 = 0;
        for (int i = 0; i < half; i++) {
            sum1 += scores[i];
        }
        int avg1 = sum1 / half;
        int sum2 = 0;
        for (int i = half; i < scores.length; i++) {
            sum2 += scores[i];
        }
        int avg2 = sum2 / (scores.length - half);
        if (avg1 > avg2) {
            return avg1;
        } else {
            return avg2;
        }
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int bestA = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0 && a[i] > bestA) {
                bestA = a[i];
            }
        }
        int bestB = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 10 == 0 && b[i] > bestB) {
                bestB = b[i];
            }
        }
        return bestA + bestB;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str.substring(0, 1) + "*";
        } else {
            return "**";
        }
    }

    public static double divide(int a, int b) {
        int big;
        int small;
        if (a > b) {
            big = a;
            small = b;
            if (small == 0) {
                return 0.0;
            }
        } else {
            big = b;
            small = a;
            if (small == 0) {
                return 0.0;
            }
        }
        double result = big * 1.0 / small;
        return result;
    }
}
