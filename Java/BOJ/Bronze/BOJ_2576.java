import java.util.Scanner;

public class BOJ_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 100;  // 최솟값 담을 변수
        int sum = 0;  // 홀수 합 담을 변수

        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();

            if (num % 2 != 0) {  // 홀수이면 sum에 누적합 더해줌
                sum += num;  // sum = sum + num

                if (min > num) {  // 최솟값 갱신
                    min = num;
                }
            }
        }

        if (sum == 0) {  // 홀수 없으면 -1 출력
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
