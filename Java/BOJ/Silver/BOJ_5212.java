package silver;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_5212 {

    static int r, c;
    static int[] dx = {-1, 0, 0, 1};  // 인접한 칸 탐색
    static int[] dy = {0, -1, 1, 0};
    static char[][] map;  // 처음 지도
    static char[][] resultMap;  // 정답 지도
    static int rowMin = Integer.MAX_VALUE;  // 정답 지도의 최소화 변수
    static int rowMax = Integer.MIN_VALUE;
    static int colMin = Integer.MAX_VALUE;
    static int colMax = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        resultMap = new char[r][c];

        // 입력
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = str.charAt(j);
                resultMap[i][j] = map[i][j];
            }
        }

        // 50년 후 물에 잠기는 땅은 물에 잠기게 하기
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == 'X') {
                    check(i, j);
                }
            }
        }

        // 정답 지도의 최소화를 위한 변수 설정
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (resultMap[i][j] == 'X') {
                    rowMin = Math.min(rowMin, i);
                    rowMax = Math.max(rowMax, i);
                    colMin = Math.min(colMin, j);
                    colMax = Math.max(colMax, j);
                }
            }
        }

        // 지도 출력
        for (int i = rowMin; i <= rowMax; i++) {
            for (int j = colMin; j <= colMax; j++) {
                bw.write(resultMap[i][j] + "");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    private static void check(int i, int j) {  // 3면 이상이 바다면 잠기도록 구현
        int cnt = 0;
        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx < 0 || nx >= r || ny < 0 || ny >= c || map[nx][ny] == '.') {  // 지도 범위 안밖의 근처 바다 카운트
                cnt++;
            }
        }

        if (cnt >= 3) {  // 3면 이상이 바다면 잠기게 함
            resultMap[i][j] = '.';
        }
    }
}
