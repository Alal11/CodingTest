package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o2.length() > o1.length()) {
                    return -1;
                } else {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) > o2.charAt(i)) {
                            return 1;
                        } else if (o2.charAt(i) > o1.charAt(i)) {
                            return -1;
                        }
                    }
                }
                return 0;  // o1과 o2가 완전히 같은 경우
            }
        });

        String str = "";
        for (String word : arr) {
            if(!word.equals(str)){
                System.out.println(word);
                str = word;
            }
        }
    }
}
