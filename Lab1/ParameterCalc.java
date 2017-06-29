/**
 * Created by RIchard on 6/26/2017.
 */

import java.util.Scanner;

public class ParameterCalc {

    public static void main(String[] args) {
        String cont = "Y";
        Scanner scan = new Scanner(System.in);
        try {
            while (cont.equals("Y")){
                System.out.println("Enter Length:");
                double length = scan.nextDouble();
                System.out.println("Enter Width:");
                double width = scan.nextDouble();
                System.out.println("Area: " + length * width);
                System.out.println("Perimeter: " + ((2 * length) + (2 * width)));
                System.out.println("Continue? ('Y' to proceed).");
                cont = scan.next();
                System.out.println(cont.equals("Y"));
            }
        }
        catch (Exception e) {
            System.out.println("Incorrect input.");
        }

    }
}
