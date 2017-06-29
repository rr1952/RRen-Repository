import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by RIchard on 6/28/2017.
 */
public class PowerTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Learn your squares and cubes!");
        int userNum;
        String sofa = "";
        do {
            System.out.println("Enter an Integer: ");
            if (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("That's not a valid input.");
                continue;
            }
            userNum = scan.nextInt();
            //dummy clear
            scan.nextLine();
            System.out.printf("%-7s\t\t%-7s\t\t%-7s\n", "Number", "Square", "Cube");
            System.out.printf("%-7s\t\t%-7s\t\t%-7s\n", "-------", "-------", "-------");
            for (int i = 1; i <= userNum; i++) {
                System.out.printf("%-7d\t\t%-7d\t\t%-7d\n", i, (int) Math.pow(i,2), (int) Math.pow(i,3));
            }
            System.out.println("Continue? Y/N");
            sofa = scan.nextLine();
        } while (sofa.equalsIgnoreCase("Y"));
        System.out.println("Goodbye!");
    }

}
