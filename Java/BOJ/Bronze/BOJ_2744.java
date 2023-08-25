import java.util.Scanner;

public class BOJ_2744{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();

        StringBuilder result= new StringBuilder();

        for(char x:str.toCharArray()){
            if(Character.isLowerCase(x)){
                result.append(Character.toUpperCase(x));
            }
            else{
                result.append(Character.toLowerCase(x));
            }
        }
        System.out.println(result);
    }
}
