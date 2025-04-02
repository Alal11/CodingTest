import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();

            int a = Integer.parseInt(s.substring(0, 1));
            int b = Integer.parseInt(s.substring(2));

            System.out.println(a + b);
        }
    }
}
