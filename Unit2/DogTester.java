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
        System.out.println(d1.generateDogTag());
        System.out.println(d2.generateDogTag());
        System.out.println(d3.generateDogTag());
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

        // 7) test generateDogChar()
        private static void testGenerateDogChar() {
            int id1 = 123; // given example
            int id2 = 456;
            int id3 = 152;

            System.out.println(Dog.generateDogChar(id1)); // expect L
            System.out.println(Dog.generateDogChar(id2)); // expect U
            System.out.println(Dog.generateDogChar(id3)); // expect N
        }

        // 8) test pickup()
        private static void testPickup() {
            // Create a Dog and make sure it is checked in under owner "Maria"
            Dog myDog = new Dog();
            Dog.checkIn(myDog, "Maria");  // now in facility under "Maria"

            System.out.println(Dog.toString);

            // Scenario 1: correct owner
            String okToPick = Dog.pickup(myDog, "Maria");
            System.out.println(Dog.toString);

            // Scenario 2: wrong owner
            String errToPick = Dog.pickup(myDog, "John");
            System.out.println(Dog.toString);
        }

        // 9) test checkIn()
        private static void testCheckIn() {
            // Create a Dog that starts as NOT in the facility
            Dog otherDog = new Dog();
            otherDog.toString = false; // per instructions (field is public in this assignment)

            System.out.println("Before checkIn, stillInFacility = " + otherDog.toString);

            // Check the dog in under a new owner
            Dog.checkIn(otherDog, "NewOwner");

            // Verify results
            System.out.println("After checkIn, stillInFacility = " + otherDog.toString); // should be true
            System.out.println("Owner after checkIn = " + otherDog.getOwnerName());              // should be "NewOwner"
        }
        
}
