import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Arrays.sort(arr);
        double one = sum > 0 ? sum / n + 0.5 : sum / n - 0.5;

        int maxCount = 0;
        List<Integer> modeList = new ArrayList<>();

        for (Integer key : map.keySet()) {
            int count = map.get(key);
            if (count > maxCount) {
                maxCount = count;
                modeList.clear();
                modeList.add(key);
            } else if (count == maxCount) {
                modeList.add(key);
            }
        }
        Collections.sort(modeList);
        int mode = modeList.size() > 1 ? modeList.get(1) : modeList.get(0);

        System.out.println((int) one);
        System.out.println(arr[n / 2]);
        System.out.println(mode);
        System.out.println(arr[n - 1] - arr[0]);
    }
}
