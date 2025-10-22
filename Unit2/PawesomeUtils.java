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
        int sum = (dogId / 100) + ((dogId / 10) % 10) +(dogId % 10);
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
    }
}