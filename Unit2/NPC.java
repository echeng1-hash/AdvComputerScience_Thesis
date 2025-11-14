public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        if (!RPSGame.validateChoice(this.choice)) {
            this.choice = RPSGame.generateRandomChoice();
        }
        // if (!choice.equals("rock") 
        //     && !choice.equals("paper") 
        //     && !choice.equals("scissors")) {
        //         this.choice = RPSGame.generateRandomChoice();
        //     } else {
        //         choice = choice.toLowerCase();
        //     }
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}
