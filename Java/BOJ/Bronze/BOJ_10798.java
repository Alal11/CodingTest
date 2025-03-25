import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            int len = s.length();
            int cnt = 0;
            for (int j = 0; j < 15; j++) {
                if (cnt >= len) {
                    arr[i][j] = '@';
                } else {
                    arr[i][j] = s.charAt(j);
                }
                cnt++;
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != '@') {
                    sb.append(arr[i][j]);
                }
            }
        }
        System.out.print(sb);
    }
}
