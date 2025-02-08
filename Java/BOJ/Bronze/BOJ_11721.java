package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (cnt == 10) {
                System.out.println();
                cnt = 0;
            }
            System.out.print(c);
            cnt++;
        }
    }
}
