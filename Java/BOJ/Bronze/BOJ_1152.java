import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringTokenizer st=new StringTokenizer(str);  // split 대신 이걸 쓰는게 좋음

        bw.write(st.countTokens() + "\n");

        bw.flush();
        bw.close();
    }
}