package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ra = reverse(a);
        int rb = reverse(b);

        if (ra > rb) {
            System.out.println(ra);
        } else {
            System.out.println(rb);
        }
    }

    static int reverse(int n) {
        int result = 0;
        result += (n / 100);
        n = n % 100;
        result += (n / 10) * 10;
        n = (n % 10) * 100;
        result += n;

        return result;
    }
}
