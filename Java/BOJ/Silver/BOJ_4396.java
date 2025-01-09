package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4396 {

    static char[][] arr;
    static char[][] result;
    static int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
    static int[] dy = {1, -1, 0, 1, -1, 0, 1, -1};
    static int n;
    static boolean how = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        result = new char[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                char s = input.charAt(j);
                if (s == 'x' && (arr[i][j] == '.')) {
                    check(i, j);
                } else if (s == 'x' && (arr[i][j] == '*')) {
                    how = false;
                } else {
                    result[i][j] = '.';
                }
            }
        }

        boom();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }


    private static void check(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (arr[nx][ny] == '*') {
                    cnt++;
                }
            }
            result[x][y] = (char) (cnt + '0');
        }
    }

    private static void boom(){
        if(!how){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] == '*'){
                        result[i][j] = '*';
                    }
                }
            }
        }
    }
}
