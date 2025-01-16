package silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815 {
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st1.nextToken());
            bw.write(BinarySearch(num) + " ");
        }

        bw.flush();
        bw.close();
    }

    static int BinarySearch(int num) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num > arr[mid]) {
                start = mid + 1;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
