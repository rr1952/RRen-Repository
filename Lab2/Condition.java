package ren;

/**
 * Created by RIchard on 6/27/2017.
 */

import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        int x;
        String repeat = "Y";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");

        do {
            System.out.println("Enter an integer between 1 and 100, " + name + ".");
            if(!scan.hasNextInt()) {
                System.out.println("You entered an invalid input!");
                scan.nextLine();
                continue;
            }
            x = scan.nextInt();
            scan.nextLine();
            if(x < 1 || x > 100) {
                System.out.println("You entered a number outside the range!");
                continue;
            }
            else if (x%2 == 1 && x > 60) System.out.println( x + ": Odd and over 60.");
            else if (x%2 == 0 && x > 60) System.out.println(x + ": Even.");
            else if (x%2 == 0 && x < 25) System.out.println("Even and less than 25.");
            else if (x%2 == 1) System.out.println(x + ": Odd.");
            else if (x%2 == 0 && x > 25) System.out.println("Even.");

            System.out.println("Continue? ('Y' to continue)");
            repeat = scan.nextLine();
        } while (repeat.equalsIgnoreCase("Y"));

        System.out.println("Goodbye, " + name + "!");

    }
}
