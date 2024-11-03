package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());  // 시작
            arr[i][1] = Integer.parseInt(st.nextToken());  // 종료
        }

        // Comparator 반환값 : 음수 반환-> 첫 번째 요소가 두 번째 요소보다 앞에 오도록 정렬
        // 양수 반환 -> 첫 번째 요소가 두 번째 요소보다 뒤에 오도록 정렬
        // 0 반환 -> 두 요소가 동등하다는 뜻으로, 정렬 순서를 바꾸지 않는다.
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {  // 첫 번째 회의, 두 번째 회의
                if (o1[1] == o2[1]) {  // 두 회의의 종료 시간이 같다면
                    return o1[0] - o2[0];  // 시작 시간이 더 빠른 순서대로 정렬
                    // o1[0]이 o2[0]보다 작으면 음수 반환 -> o1이 앞에 위치
                } else {
                    return o1[1] - o2[1];  // 종료 시간이 더 빠른 순서대로 정렬
                }
            }
        });

        int end = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= end) {
                cnt++;
                end = arr[i][1];
            }
        }
        System.out.println(cnt);
    }
}
