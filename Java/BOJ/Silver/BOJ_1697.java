package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {

    static int[] dist = new int[100002];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            return;
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);
        dist[n] = 1;

        while (!queue.isEmpty()) {
            int index = queue.remove();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = index + 1;
                } else if (i == 1) {
                    next = index - 1;
                } else {
                    next = index * 2;
                }

                if (next == k) {
                    System.out.println(dist[index]);
                    return;
                }

                if (next >= 0 && next <= 100000 && dist[next] == 0) {
                    queue.add(next);
                    dist[next] = dist[index] + 1;
                }
            }
        }
    }
}
