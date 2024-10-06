import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];
        for (int i = 1; i <= 30; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    arr[j] = -1;
                }
            }
        }

        int[] result = new int[2];

        int cnt = 0;
        for (int i = 1; i <= 30; i++) {
            if (arr[i] != -1) {
                result[cnt] = i;
                cnt++;
            }
        }

        Arrays.sort(result);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
