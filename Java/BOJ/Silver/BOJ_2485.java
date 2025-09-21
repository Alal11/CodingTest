package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;

        for (int i = 0; i < n - 1; i++) {
            int d = arr[i + 1] - arr[i];
            gcd = findGcd(d, gcd);  // 거리의 최대공약수
        }

        System.out.println((arr[n - 1] - arr[0]) / gcd + 1 - (arr.length));
    }

    private static int findGcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
