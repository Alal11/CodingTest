package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        long rseult = 1;
        for (long i = 2; i <= n; i++) {
            rseult *= i;
        }
        if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println(rseult);
        }
    }
}
