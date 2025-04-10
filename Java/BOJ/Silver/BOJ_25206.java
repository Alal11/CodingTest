import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalGrade = 0.0;
        double totalCredit = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            if (!score.equals("P")) {
                totalCredit += credit;
                totalGrade += credit * cal(score);
            }
        }

        System.out.println(totalGrade / totalCredit);
    }

    private static double cal(String score) {
        switch (score) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0;
        }
    }
}
