public abstract class Animal {
    private String name;
    private String habitat;
    private int averageLifespanYears;
    private String diet;
    private boolean hungry;

    public Animal() {

    }

    public Animal(String name, String habitat, int averageLifespanYears, String diet) {
        this.name = name;
        this.habitat = habitat;
        this.averageLifespanYears = averageLifespanYears;
        this.diet = diet;
        this.hungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAverageLifespanYears() {
        return averageLifespanYears;
    }

    public void setAverageLifespanYears(int averageLifespanYears) {
        this.averageLifespanYears = averageLifespanYears;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void makeHungry() {
        hungry = true;
    }

    public void eat() {
        if (hungry) {
            System.out.println(name + " is eating.");
            hungry = false;
        } else {
            System.out.println(name + " is not hungry right now.");
        }
    }

    public void printBasicInfo() {
        System.out.println(toString());
    }

    public String toString() {
        return "-- " + name + " --\n"
                + "Habitat: " + habitat + "\n"
                + "Diet: " + diet + "\n"
                + "Average lifespan: " + averageLifespanYears + " years\n"
                + "Hungry: " + hungry;
    }
}