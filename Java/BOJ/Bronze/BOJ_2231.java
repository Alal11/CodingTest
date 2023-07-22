import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Boolean check = false;

        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            int j = i;
            while (j > 0) {
                sum += j % 10;
                j /= 10;
            }
            if (n == i + sum) {
                System.out.println(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(0);
        }
    }
}
