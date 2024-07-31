import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("#")) {
                break;
            }

            String[] arr = new String[str.length()];
            String search = str.substring(0, 1);
            int cnt = 0;

            for (int i = 0; i < str.length() - 1; i++) {
                arr[i] = str.substring(i + 1, i + 2).toLowerCase();
                if (arr[i].equals(search)) {
                    cnt++;
                }
            }
            System.out.println(search + " " + cnt);
        }
    }
}
