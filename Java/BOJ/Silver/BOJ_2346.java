import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Balloon> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            deque.add(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }


        while (!deque.isEmpty()) {
            sb.append(deque.getFirst().idx + " ");
            int moveIndex = deque.pollFirst().val;

            if (deque.isEmpty())
                break;

            if (moveIndex > 0) {
                moveIndex--;
                for (int i = 0; i < moveIndex; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < -moveIndex; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        System.out.println(sb);
    }
}

class Balloon {
    int idx, val;

    public Balloon(int idx, int val) {
        this.idx = idx;
        this.val = val;
    }
}
