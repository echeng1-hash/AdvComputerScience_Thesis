public class DogTester {
    public static void main(String[] args) {
        // (a) parameterized constructor with sample values
        Dog d1 = new Dog("Luna", 123, "Lab", 3, true);
        // (b) default constructor
        Dog d2 = new Dog();
        // (c) another dog with different values
        Dog d3 = new Dog("Nico", 693, "Husky", 5, true);

        // 2) Print initial values (getters)
        printDogBasics("d1", d1);
        printDogBasics("d2", d2);
        printDogBasics("d3", d3);

        // 3) Modify at least two attributes using setters, then print again
        d2.setName("Buddy");
        d2.setId(450);
        d2.setBreed("Beagle");
        d2.setAge(2);
        d2.setStillInFacility(true);
        d3.setAge(6);
        d3.setStillInFacility(false); // edge case for step 6 later

        printDogBasics("d2 (after edits)", d2);
        printDogBasics("d3 (after edits)", d3);

        // 4) Test specialized methods
        

        System.out.println("\n.toString() output:");
        System.out.println("d1: " + d1.toString());
        System.out.println("d2: " + d2.toString());
        System.out.println("d3: " + d3.toString());

        // 5) Test equals
        System.out.println(

        // make an exact copy of d1 (same fields) to test true case
        Dog d1Copy = new Dog(d1.getName(), d1.getId(), d1.getBreed(), d1.getAge(), d1.isStillInFacility());
        System.out.println(

        // 6) Edge case: change stillInFacility and see if toString() reflects it
        System.out.println(
    }
}
