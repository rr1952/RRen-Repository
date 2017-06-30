import java.util.Scanner;
import java.util.Random;

/**
 * Created by RIchard on 6/29/2017.
 */
public class DiceRollerApp {

    // will use both Random class & Math.Random() once
    static void diceRoll() {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("How many sides should each die have? ");
        if (!s.hasNextInt()) {
            System.out.println("Invalid input.");
            diceRoll();

        } else {
            int i = s.nextInt();
            if (i <= 1) {
                System.out.println("Number must be greater than 1.");
                diceRoll();
            } else {
                //dummy clear
                s.nextLine();
                // roll dice twice. Use math.ceiling to get a whole int for the RNG math.random generates from 0 -> 1
                System.out.println("Rolled " + (int) Math.ceil(Math.random() * i));
                System.out.println("Rolled " + (rand.nextInt(i) + 1));
                System.out.println("Roll again? ('Y' to continue) ");
                if (s.nextLine().equalsIgnoreCase("y")) {
                    diceRoll();
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the GC Casino!");
        diceRoll();
        System.out.println("Goodbye!");
    }
}
