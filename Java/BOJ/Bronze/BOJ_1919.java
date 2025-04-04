import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();

        boolean ch = false;
        int cnt = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    ch = true;
                    arr2[j] = '@';
                    break;
                }
            }
            if (!ch) {
                cnt++;
            }
            ch = false;
        }

        int cnt2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != '@') {
                cnt2++;
            }
        }

        System.out.println(cnt + cnt2);

    }
}
