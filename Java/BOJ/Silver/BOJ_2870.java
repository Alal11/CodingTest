package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        List<BigInteger> list = new ArrayList<>();  // 숫자의 크기가 클 수 있어서 BigInteger로 선언

        for (int i = 0; i < num; i++) {
            String temp = br.readLine();
            StringBuilder sb = new StringBuilder();

            // 문자열에서 숫자만 추출
            for (int j = 0; j < temp.length(); j++) {
                char a = temp.charAt(j);

                if (Character.isDigit(a)) {  // 정수인 경우 sb에 추가
                    sb.append(a);
                } else {  // 문자를 만나면 sb에 저장된 숫자를 리스트에 추가하고, sb를 초기화
                    if (sb.length() > 0) {
                        list.add(new BigInteger(sb.toString()));
                        sb = new StringBuilder();
                    }
                }
            }

            // 문자열의 끝에 숫자가 있을 경우 마지막 숫자 추가
            if (sb.length() > 0) {
                list.add(new BigInteger(sb.toString()));
            }
        }

        Collections.sort(list);  // 리스트 정렬

        for (BigInteger bigInteger : list) {
            System.out.println(bigInteger);
        }
    }
}
