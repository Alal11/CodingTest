package silver;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sortArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sortArr[i] = arr[i];
        }

        Arrays.sort(sortArr);

        HashMap<Integer, Integer> rank = new HashMap<>();

        int cnt = 0;
        for (int i : sortArr) {
            if (!rank.containsKey(i)) {
                rank.put(i, cnt);
                cnt++;
            }
        }

        for (int i : arr) {
            bw.write(rank.get(i) + " ");
        }

        bw.flush();
        bw.close();
    }
}
