import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_21918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());

            if (a == 1) {
                arr[b] = c;
            } else if (a == 2) {
                for (int j = b; j <= c; j++) {
                    if (arr[j] == 0) {
                        arr[j] = 1;
                    } else {
                        arr[j] = 0;
                    }
                }
            } else if (a == 3) {
                for (int j = b; j <= c; j++) {
                    arr[j] = 0;
                }
            } else {
                for (int j = b; j <= c; j++) {
                    arr[j] = 1;
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
