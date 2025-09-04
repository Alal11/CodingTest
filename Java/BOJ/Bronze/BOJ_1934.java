package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int cnt = 1;
            while (true) {
                if ((b * cnt) % a == 0) {
                    System.out.println(b * cnt);
                    break;
                } else {
                    cnt++;
                }
            }
        }
    }
}
