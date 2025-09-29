public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby", true); //1. Add "new" //7. Add "true", could be "false" as well
        Cat otherCat = new Cat("Tiger Beast", "Tabby", true); //2. Add "new" //8. Add "true", could be "false" as well
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); //4. Add "System.out.println("

        System.out.println("Are the cat's equal?" + myCat.equals(otherCat)); //5. change "return" into "System.out.println()"

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); //6. change "print" to "System.out.println"

        String firstName = "Tiger";
        String lastName = "Beast"; //3. make "==" into "="
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}