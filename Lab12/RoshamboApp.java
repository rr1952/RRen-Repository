import java.util.Scanner;

/**
 * Created by: RIchard
 * Date of Creation: 7/10/2017
 */
public class RoshamboApp {

    // Validates whether a proper team was inputted.
    public static Player validateTeam(String input, Scanner scan) {
        while (!(input.equalsIgnoreCase("R") || input.equalsIgnoreCase("CPU"))) {
            System.out.println("Hey, that's an invalid input. Rocks (R) or Random CPU (CPU)?");
            input = scan.nextLine();
        }
        switch (input.toUpperCase()) {
            case "R": return new TheRocks();
            case "CPU": return new TheRandom();
            default: return null;
        }
    }

    public static String validateRPS(String input, Scanner scan) {
        while (!(input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P") || input.equalsIgnoreCase("S"))) {
            System.out.println("Not a valid choice. Rock(R), Paper(P), or Scissors(S)");
            input = scan.nextLine();
        }
        return input.toUpperCase();
    }
    public static void RPS(Player player, Player CPU) {
        System.out.println(player + ": " + player.getRps_value());
        System.out.println(CPU + ": " + CPU.getRps_value());

        if(player.getRps_value() == Roshambo.ROCK) {
            switch (CPU.getRps_value()){
                case SCISSORS:
                    System.out.println(player + " wins!");
                    break;
                case ROCK:
                    System.out.println("Draw!");
                    break;
                case PAPER:
                    System.out.println(CPU + " wins!");
                    break;
            }
        }
        else if(player.getRps_value() == Roshambo.PAPER) {
            switch (CPU.getRps_value()){
                case ROCK:
                    System.out.println(player + " wins!");
                    break;
                case PAPER:
                    System.out.println("Draw!");
                    break;
                case SCISSORS:
                    System.out.println(CPU + " wins!");
                    break;
            }
        }
        else if(player.getRps_value() == Roshambo.SCISSORS) {
            switch (CPU.getRps_value()){
                case PAPER:
                    System.out.println(player + " wins!");
                    break;
                case SCISSORS:
                    System.out.println("Draw!");
                    break;
                case ROCK:
                    System.out.println(CPU + " wins!");
                    break;
            }
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        RPSPlayer player = new RPSPlayer();
        // create a player first, that way we can set him to TheRocks or TheRandom based on user input.
        Player CPU;
        System.out.println("Welcome to RockPaperScissors!");
        System.out.println("Enter your name: ");
        player.setName(scan.nextLine());
        System.out.println("Would you like to play against The Rocks or The Random CPU? (R/CPU)");
        CPU = validateTeam(scan.nextLine(), scan);
        // everything below this should be in its own method.
        simulator(scan, player, CPU);
    }

    static void simulator(Scanner scan, RPSPlayer player, Player CPU) {
        do {
            System.out.println("Rock, Paper, or Scissors? (R/P/S)");
            player.setRps_value(player.generateRoshambo(validateRPS(scan.nextLine(), scan)));
            CPU.setRps_value(CPU.generateRoshambo());
            System.out.println(CPU.getRps_value());
            RPS(player, CPU);
            System.out.println("Continue Playing(Y/N)");
        } while(validateCont(scan.nextLine(), scan).equalsIgnoreCase("Y"));
    }
    public static String validateCont(String s, Scanner scan) {
        while (!(s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("N"))) {
            System.out.println("Y/N?");
            s = scan.nextLine();
        }
        return s;
    }
}
