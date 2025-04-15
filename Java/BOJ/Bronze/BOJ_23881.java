package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_23881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int maxIndex = 0;
            int maxValue = 0;
            for (int j = 0; j < n - i; j++) {
                if (maxValue < arr[j]) {
                    maxValue = arr[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != n - i - 1) {
                int temp = arr[n - i - 1];
                arr[n - i - 1] = maxValue;
                arr[maxIndex] = temp;
                cnt++;

                if (cnt == k) {
                    System.out.println(temp + " " + maxValue);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
