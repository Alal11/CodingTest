import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class BOJ_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        HashMap<Character, Integer> h = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            h.put((char) (97 + i), i + 1);
        }

        String str = br.readLine();

        BigInteger result = BigInteger.ZERO;
        BigInteger r = BigInteger.valueOf(31);

        for (int i = 0; i < num; i++) {
            char c = str.charAt(i);

            BigInteger a = BigInteger.valueOf(h.get(c));
            BigInteger b = r.pow(i);

            result = result.add(a.multiply(b));

        }
        System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
    }
}
