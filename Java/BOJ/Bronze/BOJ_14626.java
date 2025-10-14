package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = br.readLine();

        int starPos = isbn.indexOf('*');

        for (int i = 0; i <= 9; i++) {
            String temp = isbn.substring(0, starPos) + i + isbn.substring(starPos + 1);

            int sum = 0;
            for (int j = 0; j < 13; j++) {
                int num = temp.charAt(j) - '0';
                if (j % 2 == 0) {
                    sum += num;
                } else {
                    sum += num * 3;
                }
            }

            if (sum % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
