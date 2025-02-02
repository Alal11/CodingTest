package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int start = 1;  // 최소 거리가 가질 수 있는 최솟값
        int end = arr[n - 1] - arr[0];  // 최대 거리가 가질 수 있는 최댓값

        while (start <= end) {
            int mid = (start + end) / 2;  // 공유기 사이 최소 거리

            int cnt = 1;  // 설치 공유기 개수 (첫번째 집은 무조건 설치)
            int lastPoint = arr[0];  // 마지막 공유기 설치 위치 (이미 첫번째 집은 체크함)

            for (int i = 1; i < n; i++) {
                int point = arr[i];  // 공유기 설치 지점

                if (point - lastPoint >= mid) {
                    lastPoint = point;
                    cnt++;
                }
            }

            if (cnt >= c) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        System.out.println(start - 1);

    }
}
