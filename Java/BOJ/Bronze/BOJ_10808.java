package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            int index = c - '0' - 49;
            arr[index]++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
