import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str1 = st.nextToken();
            String str2 = st.nextToken();

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean check = true;

            if(arr1.length != arr2.length){
                check = false;
            }else{
                for (int j = 0; j < arr1.length; j++) {
                    if (arr1[j] != arr2[j]) {
                        check = false;
                    }
                }
            }

            if (check) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }

    }
}
