package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger num1 = new BigInteger(br.readLine());
        String s = br.readLine();
        BigInteger num2 = new BigInteger(br.readLine());

        if (s.equals("+")) {
            System.out.println(num1.add(num2));
        } else {
            System.out.println(num1.multiply(num2));
        }
    }
}
