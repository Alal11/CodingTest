import java.io.*;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (65 <= str.charAt(i) && str.charAt(i) >= 90) {
                arr[str.charAt(i) - 65]++;
            } else {
                arr[str.charAt(i) - 97]++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        bw.write(ch + "\n");

        bw.flush();
        bw.close();
    }
}

// A: 65
// a: 97
// + 25
// Z: 90
// z: 122