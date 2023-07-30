import java.io.*;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        int result = 0;


        for (int i = 0; i < 10; i++) {
            boolean cnt = true;
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    cnt = false;
                    break;
                }
            }
            if (cnt) {
                result++;
            }
        }
        System.out.println(result);
    }
}
