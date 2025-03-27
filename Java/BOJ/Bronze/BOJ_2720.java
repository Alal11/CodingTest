import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());

            int q = c / 25;
            c %= 25;

            int d = c / 10;
            c %= 10;

            int n = c / 5;
            c %= 5;

            int p = c;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
