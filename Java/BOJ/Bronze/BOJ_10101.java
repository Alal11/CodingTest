package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = a + b + c;
        if (sum != 180) {
            System.out.println("Error");
        } else {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else {
                if (a != b && b != c && a != c) {
                    System.out.println("Scalene");
                } else {
                    System.out.println("Isosceles");
                }
            }
        }
    }
}
