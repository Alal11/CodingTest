package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = (n / 5) + (n / 25) + (n / 125);

        System.out.println(result);
    }
}

// 5의 배수 + 25의 배수 + 125의 배수

