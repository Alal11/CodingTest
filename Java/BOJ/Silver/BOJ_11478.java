package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        HashSet<String> hashSet = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt++;
            for (int j = 0; j < s.length() - i; j++) {
                String str = s.substring(j, j + cnt);
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                }
            }
        }
        System.out.println(hashSet.size());
    }
}
