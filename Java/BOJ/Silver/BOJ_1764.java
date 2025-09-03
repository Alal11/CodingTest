package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hashSet.add(br.readLine());
        }

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (hashSet.contains(str)) {
                arrayList.add(str);
            }
        }

        Collections.sort(arrayList);

        System.out.println(arrayList.size());
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
