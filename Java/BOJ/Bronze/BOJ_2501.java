package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[i - 1] = i;
            }
        }

        int cnt = 0;
        boolean chk = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                cnt++;
            }
            if (k == cnt) {
                System.out.println(arr[i]);
                chk = true;
                break;
            }
        }
        if (!chk) {
            System.out.println(0);
        }
    }
}
