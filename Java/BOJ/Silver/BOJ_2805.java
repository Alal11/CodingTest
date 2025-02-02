package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int min = 0, max = 0;

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        while (max >= min) {
            long sum = 0;
            int h = (min + max) / 2;

            for (int i : arr) {
                if (h < i) {
                    sum += i - h;
                }
            }

            if (sum < m) {
                max = h - 1;
            } else {
                min = h + 1;
            }
        }

        System.out.println(min - 1);
    }
}
