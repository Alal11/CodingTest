import java.util.Scanner;

public class BOJ_15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        System.out.println((long) (Math.pow(a, 2) - Math.pow(b, 2)));
    }
}
