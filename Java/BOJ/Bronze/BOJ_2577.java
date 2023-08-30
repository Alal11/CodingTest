import java.io.*;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int gob = a * b * c;

        String s = Integer.toString(gob);

        int[] result = new int[10];
        for (int i = 0; i < s.length(); i++) {
            result[(s.charAt(i)-'0')]++;
        }

        for (int i = 0; i < 10; i++) {
            bw.write(result[i] + "\n");
        }
        bw.close();
    }
}
