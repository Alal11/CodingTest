import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());

            arr[i][0] = s;
            arr[i][1] = y;
        }

        for (int i = 0; i < n; i++) {
            int aaa = 0;
            if (arr[i][1] != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i][0] == arr[j][0] && arr[i][1] == arr[j][1]) {
                        aaa++;
                        arr[j][1] = 0;
                    }
                }
                aaa++;
            }


            if (aaa <= k && aaa != 0) {
                cnt++;
            } else if (aaa > k) {
                if (aaa % k == 0) {
                    cnt += aaa / k;
                } else {
                    cnt += aaa / k + 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
