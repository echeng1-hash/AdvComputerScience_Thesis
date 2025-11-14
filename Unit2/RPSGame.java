import java.util.Scanner;

public class RPSGame {
    // instance variables
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your choice (rock/paper/scissors): ");
		String choice = sc.nextLine();
        int times = 1;
		while(!validateChoice(choice)){
			if (times > 2){
				choice = generateRandomChoice();
			} else {
                System.out.print("Invalid! Your choice again please: ");
                choice = sc.nextLine();
                times++;
            }
        }
        setPlayerValues(name, choice);
        sc.close();
    }

    public void setPlayerValues(String name, String choice){
        player.setChoice(choice);
		player.setName(name);
	}

	public boolean didPlayerWin(){
		String opChoice = opponent.getChoice();
		String plChoice = player.getChoice();
		if (plChoice.equals("rock") && opChoice.equals("scissors") || 
			plChoice.equals("paper") && opChoice.equals("rock") ||
			plChoice.equals("scissors") && opChoice.equals("paper")	) {
                return true;
            } else {
                return false;
            }
	}

    public String toString(){
		if (didPlayerWin()) {
            return player.getName() + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
	}

	public String displayResults(){
		String result = "== GAME RESULTS ==\n";
		result += player.toString() + "\n" + opponent.toString() + "\n";
		return result + toString();
	}

	public static boolean validateChoice(String choice){
		return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
	}

	public static String generateRandomChoice(){
		int s = (int)(Math.random() * 3);
		if (s == 0)
			return "rock";
		else if (s == 1)
			return "paper";
		return "scissors";
	}
}