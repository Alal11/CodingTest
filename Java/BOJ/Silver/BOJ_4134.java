package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            System.out.println(findPrime(n));
        }
    }

    private static long findPrime(long n) {
        if (n <= 2) {
            return 2;
        }

        while (!isPrime(n)) {
            n++;
        }

        return n;
    }

    private static boolean isPrime(long n) {

        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
