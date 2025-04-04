package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 2];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            if (dp[i] >= 10007) {
                dp[i] = dp[i] % 10007;
            }
        }

        System.out.println(dp[n]);

    }
}

/*  2, 3, 4의 관계에 주목
dp[0] = 0;
dp[1] = 1; |
dp[2] = 2; ||, =
dp[3] = 3; |||, =|, |=
dp[4] = 5; ||||, =||, |=|, ||=, == -> (dp[3]+|) + (dp[2]+=)
*/
