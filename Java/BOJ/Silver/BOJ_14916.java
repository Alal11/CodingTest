package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        int two = 2;
        int five = 5;


        while (n > 0) {
            if (n % five == 0) {
                cnt += n / five;
                break;
            } else {
                n -= two;
                cnt++;
            }
        }

        if (n < 0) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}
