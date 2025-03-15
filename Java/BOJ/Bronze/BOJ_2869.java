import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int h = 0;
        int cnt = 0;

        cnt += (v - a) / (a - b);
        h = cnt * (a - b);

        while (h < v) {
            cnt++;
            h += a;
            if (h >= v) {
                break;
            } else {
                h -= b;
            }
        }
        System.out.println(cnt);
    }
}
