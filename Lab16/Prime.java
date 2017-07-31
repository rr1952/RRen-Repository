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
}
