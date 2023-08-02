import java.util.Scanner;

public class BOJ_2738 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int[][] arr=new int[a][b];

        int k=0;
        while (k<2) {
            for(int i=0; i<a; i++)
            {
                for(int j=0; j<b; j++)
                {
                    arr[i][j]+=sc.nextInt();
                }
            }
            k++;
        }

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
