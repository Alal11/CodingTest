package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());

        a += d / 3600;
        b += (d % 3600) / 60;
        c += (d % 3600) % 60;

        if (c >= 60) {
            b += c / 60;
            c = c % 60;
        }
        if (b >= 60) {
            a += b / 60;
            b = b % 60;
        }
        if (a >= 24) {
            a = a % 24;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
