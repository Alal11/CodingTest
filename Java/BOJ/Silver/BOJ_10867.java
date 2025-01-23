package silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int num = -1;
        for (int i : arr) {
            if (num != i) {
                bw.write(i + " ");
                num = i;
            }
        }
        bw.flush();
        bw.close();
    }
}
