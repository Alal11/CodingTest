package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean chk = group(br.readLine());
            if (chk) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean group(String str) {
        char[] arr = new char[str.length()];
        int[] alpha = new int[26];
        boolean chk = true;

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            int n = (int) arr[i] - 'a';

            if (alpha[n] == 0) {
                alpha[n] = 1;
            } else if (alpha[n] == 1 && arr[i] != arr[i - 1]) {
                chk = false;
                break;
            }
        }
        return chk;
    }
}
