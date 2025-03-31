import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(st.nextToken());
        int jb = Integer.parseInt(st.nextToken());

        while (num >= 1) {
            int k = num % jb;

            if (k >= 10 && k <= 35) {
                k += 55;
                sb.append((char) k);
            } else {
                sb.append(k);
            }
            num /= jb;
        }
        System.out.println(sb.reverse());
        
    }
}
