import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();

        int commandCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < commandCnt; i++) {
            String command = br.readLine();

            if (command.equals("size")) {
                System.out.println(s.size());
            } else if (command.equals("pop")) {
                if (s.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(s.pop());
                }
            } else if (command.equals("empty")) {
                if (s.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (command.equals("top")) {
                if (s.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(s.peek());  // top이 아니라 peek!
                }
            } else {
                s.add(Integer.parseInt(command.substring(5)));
            }
        }
    }
}
