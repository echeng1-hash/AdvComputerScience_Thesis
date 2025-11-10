public class Player {
    private String name; // default null
    private String choice; // default null
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getChoice() {
        return choice;
    }
    // to-do
    public void setChoice(String choice) {
       choice = choice.toLowerCase();
        if (!choice.equals("rock") 
            && !choice.equals("paper") 
            && !choice.equals("scissors")) {
                this.choice = RPSGame.generateRandomChoice();
            }
    }

    public String toString() {
        return name + "chose" + choice + ".";
    }
}
