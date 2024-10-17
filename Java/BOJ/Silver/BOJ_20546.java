package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());

        int[] arr = new int[14];

        int jMoney = money;
        int jCnt = 0;
        int jResult = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (jMoney >= arr[i]) {
                jCnt += jMoney / arr[i];
                jMoney %= arr[i];
            }
        }
        jResult = jMoney + arr[13] * jCnt;


        int sMoney = money;
        int sCnt = 0;
        int sThreeCnt = 0;
        int sResult = 0;

        for (int i = 1; i < 14; i++) {
            if (arr[i] > arr[i - 1]) {
                if (sThreeCnt < 0) {
                    sThreeCnt = 0;
                }
                sThreeCnt++;
            } else if (arr[i] < arr[i - 1]) {
                if (sThreeCnt > 0) {
                    sThreeCnt = 0;
                }
                sThreeCnt--;
            }

            if (sThreeCnt <= -3 && sMoney >= arr[i]) {
                sCnt += sMoney / arr[i];
                sMoney %= arr[i];
            } else if (sThreeCnt >= 3) {
                sMoney += arr[i] * sCnt;
                sCnt = 0;
            }
        }

        sResult = sMoney + arr[13] * sCnt;


        if (jResult > sResult) {
            System.out.println("BNP");
        } else if (jResult < sResult) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
