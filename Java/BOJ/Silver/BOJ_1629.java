package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());


        long result = rec(a, b, c);

        System.out.println(result);
    }

    private static long rec(long a, long b, long c) {  // a는 밑, b는 지수
        if (b == 1) {  // 지수가 1일 경우 a^1 이므로 a를 그대로 리턴
            return a % c;
        }

        long k = rec(a, b / 2, c);  // 지수의 절반에 해당하는 a^(b/2)를 구함

        if (b % 2 == 1) {  // 현재 지수가 홀수라면 a를 한 번 더 곱해줘야 함
            return (k * k % c) * a % c;  // a^(b/2) * a^(b/2) * a
        }

        return k * k % c;  // 그 외는 짝수이므로 구했던 값을 한 번 더 곱해서 반환
    }
}
