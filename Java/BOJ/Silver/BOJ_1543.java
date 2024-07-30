import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String search = br.readLine();

        int cnt = 0;
        while (str.contains(search)) {
            int index = str.indexOf(search);
            str = str.substring(index + search.length());
            cnt++;
        }
        System.out.println(cnt);
    }
}
