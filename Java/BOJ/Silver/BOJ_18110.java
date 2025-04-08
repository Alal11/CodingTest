import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        double g = (double) (n * 15) / 100;
        int gg = (int) (g + 0.5);

        int sum = 0;
        int cnt = 0;
        for (int i = gg; i < n - gg; i++) {
            sum += arr[i];
            cnt++;
        }
        double result = (double) sum / cnt + 0.5;

        System.out.println((int) result);
    }
}
