import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        long i = 1;
        while (true) {
            if ((b * i) % a == 0) {
                System.out.println(b * i);
                break;
            } else {
                i++;
            }
        }
    }
}
