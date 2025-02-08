package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1182 {
    static int n;
    static int s;
    static int cnt = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0, 0);

        if (s == 0) {  // 공집한인 경우 고려
            cnt -= 1;
        }

        System.out.println(cnt);

    }


    private static void backTracking(int index, int sum) {
        if (index == n) {
            if (sum == s) {
                cnt++;
            }
            return;
        }

        backTracking(index + 1, sum + arr[index]);  // 현재 위치 원소 선택한 경우의 수열의 합
        backTracking(index + 1, sum);  // 선택 안한 경우의 수열의 합
    }
}
