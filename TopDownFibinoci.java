import java.util.Arrays;

public class TopDownFibinoci {

    public static int fib(int[] db, int n) {
        if (n <= 1) {
            return n;
        }

        if (db[n] == -1) {

            db[n] = (fib(db, n - 1) + fib(db, n - 2));

        }
        return db[n];

    }

    public static void main(String[] args) {

        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fib(dp, n));
    }

}