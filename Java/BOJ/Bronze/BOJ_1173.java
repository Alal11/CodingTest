package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 운동 N분
        int m = Integer.parseInt(st.nextToken());  // 초기 & 최소 맥박
        int M = Integer.parseInt(st.nextToken());  // 최대 맥박
        int T = Integer.parseInt(st.nextToken());  // 운동 후 증가 맥박
        int R = Integer.parseInt(st.nextToken());  // 휴식 후 감소 맥박

        int time = 0;  // 걸린 시간
        int helTime = 0;  // 운동 시간
        int pulse = m;  // 현재 맥박

        while (helTime < N) {  // 목표 시간 채운 경우 탈출
            if (m + T > M) {  // 운동 못하는 경우
                break;
            }

            if (pulse + T <= M) {  // 운동
                helTime++;
                pulse += T;
            } else {  // 휴식
                pulse = Math.max(pulse - R, m);
            }
            time++;
        }
        if (helTime == N) {
            System.out.println(time);
        } else {
            System.out.println(-1);
        }
    }
}
