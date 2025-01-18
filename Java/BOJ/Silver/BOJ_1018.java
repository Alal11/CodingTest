package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
    static String[][] board;
    static String[][] bw;
    static String[][] wb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bw = new String[][]{{"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}};
        wb = new String[][]{{"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}};

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new String[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = str.substring(j, j + 1);
            }
        }

        int minCnt = 64;
        for (int i = 0; i < board.length - 7; i++) {
            for (int j = 0; j < board[0].length - 7; j++) {
                int bwc = bwCount(i, j);
                int wbc = wbCount(i, j);

                if (minCnt > bwc) {
                    minCnt = bwc;
                }
                if (minCnt > wbc) {
                    minCnt = wbc;
                }
            }
        }

        System.out.println(minCnt);

    }

    static int bwCount(int a, int b) {
        int bwcnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!board[i + a][j + b].equals(bw[i][j])) {
                    bwcnt++;
                }
            }
        }
        return bwcnt;
    }

    static int wbCount(int a, int b) {
        int wbcnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!board[i + a][j + b].equals(wb[i][j])) {
                    wbcnt++;
                }
            }
        }
        return wbcnt;
    }
}
