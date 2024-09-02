import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            switch (str) {
                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.remove());
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;
                case "back":

                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        int last = 0;
                        for (Integer integer : queue) {
                            last = integer;
                        }
                        System.out.println(last);
                    }
                    break;
                default:
                    queue.offer(Integer.valueOf(str.substring(5)));
                    break;
            }
        }
    }
}
