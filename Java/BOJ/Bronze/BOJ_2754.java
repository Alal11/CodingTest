import java.util.Scanner;

public class BOJ_2754 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();

        String b=a.substring(0,1);
        String c=a.substring(1);

        double result=0.0;

        switch (c) {
            case "+" -> result += 0.3;
            case "-" -> result -= 0.3;
        }

        switch (b) {
            case "A" -> result += 4.0;
            case "B" -> result += 3.0;
            case "C" -> result += 2.0;
            case "D" -> result += 1.0;
        }

        System.out.println(result);
    }
}
