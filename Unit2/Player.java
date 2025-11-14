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
 
    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        if (!RPSGame.validateChoice(this.choice)) {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
}
