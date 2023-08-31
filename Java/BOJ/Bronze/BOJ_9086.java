import java.util.Scanner;

public class BOJ_9086 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0) {
            String str = sc.next();

            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length()-1));
            t--;
        }
    }
}
