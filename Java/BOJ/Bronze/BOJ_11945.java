package bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                bw.write(str.charAt(m - j - 1) + "");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
