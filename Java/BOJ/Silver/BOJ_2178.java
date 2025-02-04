package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {

    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static int[][] arr;
    static boolean[][] visit;
    static Queue<Pair> queue = new LinkedList<>();
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];  // 초기값 false

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        queue.add(new Pair(0, 0));  // 맨 처음 좌표부터 시작함
        visit[0][0] = true;

        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            visit[pair.x][pair.y] = true;

            for (int k = 0; k < 4; k++) {
                int nx = pair.x + dx[k];
                int ny = pair.y + dy[k];

                if (isValid(nx, ny)) {
                    queue.add(new Pair(nx, ny));
                    arr[nx][ny] = arr[pair.x][pair.y] + 1;  // 이전에 있던 칸 수 누적합
                }
            }
        }
        System.out.println(arr[n - 1][m - 1]);
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < m && arr[x][y] == 1 && !visit[x][y];
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
