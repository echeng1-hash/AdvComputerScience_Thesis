import java.util.Scanner;

public class RPSGame {
    // instance variables
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public static boolean validateChoice() {

    }

    public void start() {
        String name = "";
        String choice = "";
        System.out.print("Enter your name: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
        }
    }

    public void setPlayerValues(String name, String choice) {

    }
}