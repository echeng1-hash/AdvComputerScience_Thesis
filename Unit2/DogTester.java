public class DogTester {
    public static void main(String[] args) {
        // (a) parameterized constructor with sample values
        Dog d1 = new Dog("Luna", "Lab", 3, 213);
        // (b) default constructor
        Dog d2 = new Dog();
        // (c) another dog with different values
        Dog d3 = new Dog("Nico", "Husky", 5, 693);

        // 2)Print initial values (getters)
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
        System.out.println(d1.generateDogChar());
        System.out.println(d3.generateDogChar());
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
    }
}
