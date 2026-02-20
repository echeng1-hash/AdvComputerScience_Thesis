public class Fox extends Animal {
    // 6+ instance variables
    // private String commonName; // Arctic Fox
    private String scientificName; // Vulpes lagopus
    // private String habitat; // Arctic tundra
    // private String diet; // carnivore/omnivore
    // private int averageLifespanYears; // typical wild lifespan
    private String movement; // walks/runs/swims
    private String coatColor; // white in winter, brown/gray in summer
    private double weightKg; // body weight
    private boolean migrates; // does it migrate or move seasonally
    private String conservationStatus; // Least Concern (many areas)

    // Constructor
    public Fox() {
        super("Arctic Fox",
                "Arctic tundra and coastal areas",
                4,
                "Mostly carnivore (lemmings, birds, eggs), sometimes berries");
        // this.commonName = "Arctic Fox";
        this.scientificName = "Vulpes lagopus";
        // this.habitat = "Arctic tundra and coastal areas";
        // this.diet = "Mostly carnivore (lemmings, birds, eggs), sometimes berries";
        // this.averageLifespanYears = 4;
        this.movement = "walk, run, swim, trveling";
        this.coatColor = "White (winter) / Brown-gray (summer)";
        this.weightKg = 4.0;
        this.migrates = true;
        this.conservationStatus = "Least Concern";
    }

    public Fox(String commonName, String scientificName, String habitat, String diet,
            int averageLifespanYears, String movement, String coatColor,
            double weightKg, boolean migrates, String conservationStatus) {
        super(commonName, habitat, averageLifespanYears, diet);
        // this.commonName = commonName;
        this.scientificName = scientificName;
        // this.habitat = habitat;
        // this.diet = diet;
        // this.averageLifespanYears = averageLifespanYears;
        this.movement = movement;
        this.coatColor = coatColor;
        this.weightKg = weightKg;
        this.migrates = migrates;
        this.conservationStatus = conservationStatus;
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

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public boolean isMigrates() {
        return migrates;
    }

    public void setMigrates(boolean migrates) {
        this.migrates = migrates;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    // Methods
    // abstract methods
    public void makeSound() {
        System.out.println(getName() + " yips!");
    }

    public void move() {
        System.out.println(getName() + " runs lightly over the snow.");
    }

    // Fox-specific methods
    public void hunt() {
        System.out.println(getName() + " hunts by listening under the snow and pouncing!");
        weightKg += 0.10;
        setHungry(false);
    }

    public void migration(int km) {
        if (!migrates) {
            System.out.println(getName() + " does not migrate.");
            return;
        }
        if (km <= 0) {
            System.out.println(getName() + " stayed put.");
            return;
        }
        System.out.println(getName() + " travels " + km + " km to find food.");
        weightKg -= 0.02 * km;
        if (weightKg < 0) {
            weightKg = 0;
        }
        setHungry(true);
    }

    public String toString() {
        return super.toString() + "\n"
                + "Scientific name: " + scientificName + "\n"
                + "Coat color: " + coatColor + "\n"
                + "Weight: " + weightKg + " kg\n"
                + "Migrates: " + migrates + "\n"
                + "Conservation status: " + conservationStatus;
    }
}
