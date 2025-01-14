package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arr = st.nextToken().toCharArray();
        int b = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int num;

            if ('0' <= arr[i] && arr[i] <= '9') { // 숫자
                num = arr[i] - '0';
            } else { // 알파벳
                num = arr[i] - 'A' + 10;
            }
            result += num * Math.pow(b, arr.length - i - 1);
        }
        System.out.println(result);
    }
}
