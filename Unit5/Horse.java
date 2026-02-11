public class Horse extends Animal {
    // 6+ instance variables
    // private String commonName; // "Horse"
    private String scientificName; // "Equus ferus caballus"
    // private String habitat; // farms, grasslands, stables
    // private String diet; // herbivore
    // private int averageLifespanYears; // 25-30
    private String movement; // walk/trot/canter/gallop
    private double heightHands; // horse height unit (hands)
    private double weightKg; // approximate weight
    private boolean social; // true = herd animal

    // Constructors
    public Horse() {
        super("Horse",
                "Farms and grasslands (domesticated worldwide)",
                28,
                "Herbivore (grass, hay, grains)");
        // this.commonName = "Horse";
        this.scientificName = "Equus ferus caballus";
        // this.habitat = "Farms and grasslands (domesticated worldwide)";
        // this.diet = "Herbivore (grass, hay, grains)";
        // this.averageLifespanYears = 28;
        this.movement = "Walk, trot, canter, resting";
        this.heightHands = 15.0;
        this.weightKg = 500.0;
        this.social = true;
    }

    public Horse(String commonName, String scientificName, String habitat, String diet,
            int averageLifespanYears, String movement, double heightHands,
            double weightKg, boolean social) {
        // this.commonName = commonName;
        this.scientificName = scientificName;
        // this.habitat = habitat;
        // this.diet = diet;
        // this.averageLifespanYears = averageLifespanYears;
        this.movement = movement;
        this.heightHands = heightHands;
        this.weightKg = weightKg;
        this.social = social;
    }

    // Getters and setters
    // public String getCommonName() {
    // return commonName;
    // }

    // public void setCommonName(String commonName) {
    // this.commonName = commonName;
    // }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    // public String getHabitat() {
    // return habitat;
    // }

    // public void setHabitat(String habitat) {
    // this.habitat = habitat;
    // }

    // public String getDiet() {
    // return diet;
    // }

    // public void setDiet(String diet) {
    // this.diet = diet;
    // }

    // public int getAverageLifespanYears() {
    // return averageLifespanYears;
    // }

    // public void setAverageLifespanYears(int averageLifespanYears) {
    // this.averageLifespanYears = averageLifespanYears;
    // }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public double getHeightHands() {
        return heightHands;
    }

    public void setHeightHands(double heightHands) {
        this.heightHands = heightHands;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public boolean isSocial() {
        return social;
    }

    public void setSocial(boolean social) {
        this.social = social;
    }

    // Methods(Unique behaviors)
    // Required abstract methods
    public void makeSound() {
        System.out.println(getName() + " neighs!");
    }

    public void move() {
        System.out.println(getName() + " moves at a " + gait + ".");
    }

    // Horse-specific methods
    public void canter() {
        movement = "canter";
        System.out.println(getName() + " canters across the field!");
        setHungry(true);
    }

    public double sleep(int hours) {
        if (hours <= 0) {
            System.out.println(getName() + " did not sleep.");
            return weightKg;
        }
        movement = "resting";
        System.out.println(getName() + " sleeps for " + hours + " hours.");
        weightKg -= 0.05 * hours;
        if (weightKg < 0) {
            weightKg = 0;
        }
        setHungry(true);
        return weightKg;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Scientific name: " + scientificName + "\n"
                + "Gait: " + movement + "\n"
                + "Height: " + heightHands + " hands\n"
                + "Weight: " + weightKg + " kg\n"
                + "Social: " + social;
    }
}
