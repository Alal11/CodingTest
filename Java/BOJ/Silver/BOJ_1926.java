package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static int[][] visit;
    static int n, m;
    static Queue<Pair> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && visit[i][j] == 0) {  // 시작 좌표가 그림이고, 아직 방문하지 않았으면
                    int size = 0;

                    queue.add(new Pair(i, j));  // 큐에 좌표 삽입
                    visit[i][j] = 1;  // 방문 갱신

                    while (!queue.isEmpty()) {
                        Pair pair = queue.remove();
                        size++;

                        for (int k = 0; k < 4; k++) {
                            int nx = pair.x + dx[k];
                            int ny = pair.y + dy[k];

                            if (isValid(nx, ny)) {
                                queue.add(new Pair(nx, ny));
                                visit[nx][ny] = 1;
                            }
                        }
                    }
                    if (size > maxSize) {
                        maxSize = size;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(cnt + "\n" + maxSize);
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < m && arr[x][y] == 1 && visit[x][y] == 0;
    }

    private static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
