import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[11];

        for (int i = 1; i <= 10; i++) {
            arr[i] = -1;
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int number = Integer.parseInt(st.nextToken());
            int road = Integer.parseInt(st.nextToken());

            if (arr[number] == -1) {
                arr[number] = road;
            } else if (arr[number] != road) {
                arr[number] = road;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
