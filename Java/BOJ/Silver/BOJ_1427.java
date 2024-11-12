package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] arr = br.readLine().toCharArray();
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[arr.length-i-1]);
//        }

        List<Character> li = new ArrayList<>();
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            li.add(s.charAt(i));
        }

        Collections.sort(li, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i));
        }
    }
}
