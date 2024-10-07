import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2578 {
    static int[][] arr = new int[5][5];
    static int num;
    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                num++;
                int number = Integer.parseInt(st.nextToken());

                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (arr[k][l] == number) {
                            arr[k][l] = -1;
                        }
                    }
                }

                bingoCheck();

                if (cnt >= 3) {
                    System.out.println(num);
                    return;
                }
            }
        }
    }

    public static void bingoCheck() {

        cnt = 0;
        int rows = 0;
        int cols = 0;
        int xy = 0;
        int yx = 0;
        int index = 0;

        for (int i = 0; i < 5; i++) {
            rows = 0;
            cols = 0;
            for (int j = 0; j < 5; j++) {
                rows += arr[i][j];
                cols += arr[j][i];

                if (i == j) {
                    xy += arr[i][j];
                }
                if ((i == index) && (j == (4 - index))) {
                    yx += arr[i][j];
                    index++;
                }
            }

            if (rows == -5) {
                cnt++;
            }
            if (cols == -5) {
                cnt++;
            }
            if (xy == -5) {
                cnt++;
            }
            if (yx == -5) {
                cnt++;
            }
        }
    }
}
