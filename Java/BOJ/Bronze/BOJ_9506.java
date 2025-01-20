package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            List<Integer> li = new ArrayList<>();

            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    li.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < li.size() - 1; i++) {
                    System.out.print(li.get(i) + " + ");
                }
                System.out.println(li.get(li.size() - 1));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
