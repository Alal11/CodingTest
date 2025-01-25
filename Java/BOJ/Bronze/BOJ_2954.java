package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            if (cnt != 0) {
                cnt--;
            } else if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                result.append(s);
                cnt += 2;
            } else {
                result.append(s);
            }
        }

        System.out.println(result);

    }
}
