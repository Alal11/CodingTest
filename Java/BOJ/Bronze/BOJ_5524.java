import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if ('A' <= str.charAt(j) && str.charAt(j) <= 'Z') {
                    System.out.print((char) (str.charAt(j) + 32));
                } else
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}

// A: 65 (+32)
// a: 97
// + 25
// Z: 90
// z: 122