package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int[] arr = new int[n.length()];

        boolean chk = false;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(n.substring(i, i + 1));
            sum += arr[i];

            if (arr[i] == 0) {
                chk = true;
            }
        }
        if (chk && sum % 3 == 0) {
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + "");
            }
        } else {
            System.out.println(-1);
        }
    }
}

