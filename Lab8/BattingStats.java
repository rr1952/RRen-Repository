import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by: RIchard
 * Date of Creation: 7/5/2017
 */

public class BattingStats {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cont = "";
        do {
            batStats();
            System.out.println("Continue? (Y/N)");
            cont = scan.nextLine();
            while(!(cont.equalsIgnoreCase("Y") ||  cont.equalsIgnoreCase("N"))){
                System.out.println("Hey, you didn't input Y or N. Try again.");
                cont = scan.nextLine();
            }
        } while (cont.equalsIgnoreCase("Y"));
        System.out.println("Goodbye.");
    }

    static void batStats() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter the number of at-bats:");
            int timesAtBat = scan.nextInt();
            int bases;
            double batAvg = 0, slugPercent = 0;
            while (timesAtBat <= 0) {
                scan.nextLine();
                System.out.println("Hey, you entered a non-positive value! Renter a positive value.");
                timesAtBat = scan.nextInt();
            }
            scan.nextLine();
            int[] atBat = new int[timesAtBat];
            for (int i = 0; i < atBat.length; i++) {
                System.out.println("At-bat result #" + (i + 1) + ": ");
                bases = scan.nextInt();
                while (bases < 0 || bases > 4) {
                    scan.nextLine();
                    System.out.println("Invalid input! Must be integer from 0-4. Retry:");
                    bases = scan.nextInt();
                }
                atBat[i] = bases;
            }

            for (int i : atBat) {
                if (i > 0) batAvg++;
                slugPercent += i;
            }
            batAvg /= atBat.length;
            slugPercent /= atBat.length;
            System.out.printf("Batting Average: %.3f\t Slugging Percentage: %.3f \n", batAvg, slugPercent);
        } catch  (InputMismatchException e) {
            System.out.println("Hey, you didn't input a proper integer.");
        }
    }
}
