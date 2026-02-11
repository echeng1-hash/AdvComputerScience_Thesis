public class AnimalTester {
    public static void main(String[] args) {
        // 1) Test default constructors
        Horse horse1 = new Horse();
        Fox fox1 = new Fox();

        // A 3rd "animal" object (anonymous subclass) so we can test 3 animals
        Animal mysteryAnimal = new Animal("Mystery Animal", "Unknown", 1, "Unknown") {
            public void makeSound() {
                System.out.println(getName() + " makes a strange sound...");
            }

            public void move() {
                System.out.println(getName() + " moves in a strange way...");
            }
        };

        // 2) Print using toString()
        System.out.println("\nDefault Animals (toString): ");
        System.out.println(horse1);
        System.out.println();
        System.out.println(fox1);
        System.out.println();
        System.out.println(mysteryAnimal);

        // 3) Test shared methods (from Animal)
        System.out.println("\nTesting shared Animal methods: ");
        horse1.eat(); // should eat (starts hungry)
        horse1.eat(); // should say not hungry
        horse1.makeHungry();
        horse1.eat();

        // 4) Test abstract methods (implemented in each class)
        System.out.println("\nTesting makeSound() and move(): ");
        horse1.makeSound();
        horse1.move();
        fox1.makeSound();
        fox1.move();
        // mysteryAnimal.makeSound();
        // mysteryAnimal.move();

        // 5) Test getters/setters on shared fields
        System.out.println("\nTesting getters/setters (shared fields): ");
        fox1.setHabitat("Arctic tundra");
        fox1.setDiet("Carnivore");
        fox1.setAverageLifespanYears(5);
        System.out.println("Updated Fox habitat: " + fox1.getHabitat());
        System.out.println("Updated Fox diet: " + fox1.getDiet());
        System.out.println("Updated Fox lifespan: " + fox1.getAverageLifespanYears());

        // 6) Test class-specific methods
        System.out.println("\nTesting class-specific methods: ");
        horse1.canter();
        horse1.move();
        double newWeight = horse1.sleep(3);
        System.out.println("Horse weight after sleep: " + newWeight + " kg");
        fox1.hunt();
        fox1.migration(20);

        // 7) Test parameterized constructors
        System.out.println("\nTesting parameterized constructors: ");
        Horse horse2 = new Horse(); // need to be written
        Fox fox2 = new Fox(); // need to be written
        System.out.println(horse2);
        System.out.println();
        System.out.println(fox2);
    }
}
