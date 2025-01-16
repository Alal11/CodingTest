package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            hashMap.put(name, status);
        }

        List<String> keySet = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key).equals("enter")) {
                keySet.add(key);
            }
        }
        keySet.sort(Comparator.reverseOrder());

        for (String name : keySet) {
            System.out.println(name);
        }
    }
}
