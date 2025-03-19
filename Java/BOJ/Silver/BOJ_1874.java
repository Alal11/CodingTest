import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();

        int cnt = 1;
        boolean chk = true;
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (cnt <= target) {
                s.push(cnt);
                sb.append("+\n");
                cnt++;
            }

            if (s.peek() == target) {
                s.pop();
                sb.append("-\n");
            } else {
                chk = false;
                break;
            }
        }

        if (chk) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }

    }
}
