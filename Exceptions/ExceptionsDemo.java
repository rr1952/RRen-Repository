
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by vernonscott on 6/30/17.
 */

public class ExceptionsDemo {

    public static void main(String[] args) {
        //this program will catch for invalid input
        Scanner scan = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.println("Please enter a monthly investment: ");

            double monthlyInv;

            try {
                monthlyInv = scan.nextDouble();
                //String line = scan.nextLine();
                monthlyInv = Double.parseDouble(scan.nextLine());
                // you can also directly pass in scan.nextLine()

            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid number.");
                continue;

            }

            System.out.println(monthlyInv);
            System.out.println("continue y/n");
            choice = scan.nextLine();
        }
    }
}