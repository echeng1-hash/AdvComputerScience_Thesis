public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7 && cat.getMoodLevel() <= 10) {
            return "Currently, " + cat.getName() 
                + " is in a great mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <= 7) {
            return "Currently, " + cat.getName() 
                + " is reminiscing of a past life.\nPetting is acceptable.";
        } else if (cat.getMoodLevel() < 3) {
            return "Currently, " + cat.getName() 
                + " is plotting revengeance.\nPetting is extremely risky.";
        } else {
            return null; // double check
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            sum += Integer.parseInt(String.valueOf(catId.charAt(i)));
        }
        return (char)('A' + (sum % 26));
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }
        return (int)(Math.random() * (high - low) + low);

    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) < 1000 || Integer.parseInt(catId) > 9999) {
            int temp2 = generateRandomNumber(999, 10000);
            return String.valueOf(temp2);
        } else {
            return catId;
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            moodLevel = 0;
        } else if (moodLevel > 10) {
            moodLevel = 10;
        }
        return moodLevel;
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else if (cat.getMoodLevel() < 2 && cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        } else if (cat.getMoodLevel() < 2 && !cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int temp3 = generateRandomNumber(0, 3);
        if (temp3 == 1) {
            System.out.println("Cookie did not like that...");
        } else {
            System.out.println("Cookie really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...\nDone!\n" 
            + cat.getName() + "appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up Cookie's bowl...\nDone!\n" 
            + cat.getName() + "is eating...\n" + cat.getName() + "is full!");
    }
}
