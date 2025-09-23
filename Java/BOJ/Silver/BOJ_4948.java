package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            System.out.println(findPrimeCnt(n));
        }
    }

    private static int findPrimeCnt(int n) {
        int primeCnt = 0;
        int nn = 2 * n;
        n++;
        if (n != 2 && n % 2 == 0) {
            n++;
        }
        for (int i = n; i <= nn; i += 2) {
            if (isPrime(i)) {
                primeCnt++;
            }
        }

        return primeCnt;
    }

    private static boolean isPrime(int n) {
        for (int j = 3; j * j <= n; j += 2) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}

