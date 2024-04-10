import java.util.Scanner;

public class BOJ_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] xy_arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            xy_arr[i][0] = sc.nextInt();
            xy_arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (xy_arr[i][0] < xy_arr[j][0] && xy_arr[i][1] < xy_arr[j][1]) {
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
        }
    }
}
