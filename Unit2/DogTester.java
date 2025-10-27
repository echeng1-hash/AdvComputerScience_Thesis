public class DogTester {
    public static void main(String[] args) {
        // (a) parameterized constructor with sample values
        Dog d1 = new Dog("Luna", "Lab", 3, 213);
        // (b) default constructor
        Dog d2 = new Dog();
        // (c) another dog with different values
        Dog d3 = new Dog("Nico", "Husky", 5, 693);

        // 2) Print initial values (getters)
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

        // 3) Modify at least two attributes using setters, then print again
        d1.setDogId(123);
        d2.setName("Buddy");
        d2.setOwnerName("Beagle");
        d2.setAge(2);
        d2.setStillInFacility(true);
        d3.setAge(6);
        System.out.println(d2.toString());
        System.out.println(d3.toString());

        // 4) Test specialized methods
        System.out.println(d1.getDogChar());
        System.out.println(d3.getDogChar());
        System.out.println(PawesomeUtils.generateDogTag(d1.getDogId(), d1.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(d2.getDogId(), d2.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(d3.getDogId(), d3.getDogChar()));
        System.out.println("d1: " + d1.toString());
        System.out.println("d2: " + d2.toString());
        System.out.println("d3: " + d3.toString());

        // 5) Test equals
        System.out.println(d3.equals(d1));
        Dog d4 = new Dog("Nico", "Husky", 6, 693);
        System.out.println(d3.equals(d4));

        // 6) Edge case: change stillInFacility and see if toString() reflects it
        d3.setStillInFacility(false);
        System.out.println(d3.toString());

        // 10) test validateDogId()
        System.out.println(PawesomeUtils.validateDogId(111)); // valid
        System.out.println(PawesomeUtils.validateDogId(451)); // valid
        System.out.println(PawesomeUtils.validateDogId(1900)); // invalid
        System.out.println(PawesomeUtils.validateDogId(1024)); // invalid

        // 11) evaluate validateDogTag()
        System.out.println(PawesomeUtils.validateDogTag(d1));
        System.out.println(PawesomeUtils.validateDogTag(d2));
        System.out.println(PawesomeUtils.validateDogTag(d3));

        // 12) Test edge cases with validateDogTag()
        d3.setDogChar('A');
        System.out.println(PawesomeUtils.validateDogTag(d3)); // should be false

        // 13) test convertAgeToHumanAge
        Dog d5 = new Dog("aaa", "Lab", 1, 213);
        Dog d6 = new Dog("bbb", "Lab", 2, 213);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(d5));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(d6));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(d3));

        // 14) test convertAgeToDogYears
        System.out.println(PawesomeUtils.convertAgeToDogYears(1));
        System.out.println(PawesomeUtils.convertAgeToDogYears(16));
        System.out.println(PawesomeUtils.convertAgeToDogYears(49));
    }

    // 7) test generateDogChar()
    private static void testGenerateDogChar() {
        int id1 = 123; // given example
        int id2 = 456;
        int id3 = 152;

        System.out.println(PawesomeUtils.generateDogChar(id1)); // expect L
        System.out.println(PawesomeUtils.generateDogChar(id2)); // expect U
        System.out.println(PawesomeUtils.generateDogChar(id3)); // expect N
    }

    // 8) test pickup()
    private static void testPickup() {
        // Create a Dog and make sure it is checked in under owner "Maria"
        Dog myDog = new Dog();
        PawesomeUtils.checkIn(myDog, "Maria");  // now in facility under "Maria"

        System.out.println(Dog.toString);

        // Scenario 1: correct owner
        String okToPick = PawesomeUtils.pickup(myDog, "Maria");
        System.out.println(Dog.toString);

        // Scenario 2: wrong owner
        String errToPick = PawesomeUtils.pickup(myDog, "John");
        System.out.println(Dog.toString);
    }

    // 9) test checkIn()
    private static void testCheckIn() {
        // Create a Dog that starts as NOT in the facility
        Dog otherDog = new Dog();
        // Check the dog in under a new owner
        PawesomeUtils.checkIn(otherDog, "NewOwner");

        // Verify results
        System.out.println(Dog.toString); // should be true
        System.out.println(otherDog.getOwnerName()); // should be "NewOwner"
    }
}

