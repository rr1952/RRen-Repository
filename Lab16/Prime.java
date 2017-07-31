import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int x) {
        if (x == 2) return true;
        else if (x % 2 == 0) return false;
        for (int i = 3; i*i <= x; i+=2) {
            if (x % i == 0) return false;
        }
        if (x < 0) return false;
        return true;
    }

    public static int nthPrime(int n) {
        if (n == 1) return 2;
        int primer = 1;
        for (int i = 0; i < n; i++) {
            for (int prime = primer; !isPrime(primer);primer+=2);
            if (i != n-1) primer += 2;
        }
        return primer;
    }
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hello to the prime finder!");
            System.out.println("Please insert the nth prime you'd like to find.");
            System.out.println("Your prime is: " + nthPrime(scan.nextInt()));
        } catch (Exception e) {System.out.println(e);}


    }
}
