package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max_x = -10000;
        int max_y = -10000;
        int min_x = 10000;
        int min_y = 10000;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (max_x < x) {
                max_x = x;
            }
            if (max_y < y) {
                max_y = y;
            }
            if (min_x > x) {
                min_x = x;
            }
            if (min_y > y) {
                min_y = y;
            }
        }

        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}
