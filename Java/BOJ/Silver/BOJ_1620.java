package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            hashMap1.put(i, str);
            hashMap2.put(str, i);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            char ch = str.charAt(0);
            if ('0' <= ch && ch <= '9') {
                System.out.println(hashMap1.get(Integer.parseInt(str)));
            } else {
                System.out.println(hashMap2.get(str));
            }
        }
    }
}
