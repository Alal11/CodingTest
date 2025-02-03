package silver;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        LinkedList<Character> list = new LinkedList<>();

        for (char c : str.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> iter = list.listIterator();

        while (iter.hasNext()) {  // 커서 맨 뒤로 이동
            iter.next();
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.equals("L")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                }
            } else if (command.equals("D")) {
                if (iter.hasNext()) {
                    iter.next();
                }
            } else if (command.equals("B")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
            } else {
                iter.add(command.charAt(2));
            }
        }

        for (Character c : list) {
            bw.write(c + "");
        }

        bw.flush();
        bw.close();
    }
}
