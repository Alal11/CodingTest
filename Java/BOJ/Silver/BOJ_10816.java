import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> h = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st1.nextToken());

            int cnt = 0;

            if (h.containsKey(num)) {
                cnt = h.getOrDefault(num, 0);
            }

            bw.write(cnt + " ");
        }
        bw.flush();
        bw.close();
    }
}
