public class PawesomeUtils {
    public static String generateDogTag(int dogId, char dogChar) {
        return dogId + "" + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) Math.random() * 900 + 100;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        validateDogId(dogId);
        char dogChar = generateDogChar(dogId);
        String newDogTag = "" + dogId + dogChar;
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }

    public static char generateDogChar(int dogId) {
        int sum = (dogId / 100) + ((dogId / 10) % 10) + (dogId % 10);
        int code = 'F' + (sum % 10);
        return (char) code;
    }

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " 
                + dog.getOwnerName();
        } else {
            dog.setStillInFacility(true);
            return dog.getName() + " can't leave because the person is not the owner.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
        if (validateDogTag(dog) == false) {
            System.out.println("Not valid and denied entry.");
        } else {
            System.out.println("The dog was successfully checked in.");
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + (dog.getAge() * 5);
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 5 + 2;
        }
    }
}