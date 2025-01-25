package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int[] arr = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            arr[num]++;
        }

        int cnt = arr[6] + arr[9];
        arr[6] = (cnt + 1) / 2;  // 홀짝 따라서 6과 9 합쳐 필요 값 입력
        arr[9] = 0;

        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);  // max 값 구하기
        }

        System.out.println(max);

    }
}
