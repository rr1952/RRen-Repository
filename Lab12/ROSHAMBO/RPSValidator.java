package ROSHAMBO;

import java.util.Scanner;

/**
 * Created by: RIchard
 * Date of Creation: 7/11/2017
 */
public class RPSValidator {

    //validates continues
    //zzz
    public static String validateCont(String s, Scanner scan) {
        while (!(s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("N"))) {
            System.out.println("Y/N?");
            s = scan.nextLine();
        }
        return s;
    }

    // Validates whether a proper team was inputted.
    public static Player validateTeam(String input, Scanner scan) {
        while (!(input.equalsIgnoreCase("R") || input.equalsIgnoreCase("CPU"))) {
            System.out.println("Hey, that's an invalid input. Rocks (R) or Random CPU (CPU)?");
            input = scan.nextLine();
        }
        switch (input.toUpperCase()) {
            case "R":
                return new TheRocks();
            case "CPU":
                return new TheRandom();
            default:
                return null;
        }
    }

    //Validates RPS action.
    public static String validateRPS(String input, Scanner scan) {
        while (!(input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P") || input.equalsIgnoreCase("S"))) {
            System.out.println("Not a valid choice. Rock(R), Paper(P), or Scissors(S)");
            input = scan.nextLine();
        }
        return input.toUpperCase();
    }
}
