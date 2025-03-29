package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[16];
        int width = 3;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = width * width;
            width = width + (width - 1);
        }

        System.out.println(arr[n]);

    }
}
