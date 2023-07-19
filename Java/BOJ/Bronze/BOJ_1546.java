import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(st.nextToken());

            if (j > max) {
                max = j;
            }
            sum += j;
        }
        System.out.println((double) 100 / (max * n) * sum);
    }
}
