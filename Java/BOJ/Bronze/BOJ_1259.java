import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String n = br.readLine();

            if (n.equals("0")) {
                break;
            }

            String[] arr = new String[n.length()];

            for (int i = 0; i < n.length(); i++) {
                arr[i] = Character.toString(n.charAt(i));  // 한 글자 씩 끊어 배열에 저장
            }

            Boolean check = false;

            for (int j = 0; j < arr.length / 2; j++) {
                if (arr[j].equals(arr[arr.length - j - 1])) {
                    continue;
                } else {
                    System.out.println("no");
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("yes");
            }
        }
    }
}
