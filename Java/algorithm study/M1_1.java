public class M1_1 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 1번째 답
        int count = 0;
        String st = str;

        while (st.indexOf(key) != -1) {
            count++;
            st = st.substring(st.indexOf(key) + 1);
        }
        System.out.println(count);

        // 2번째 답
        int cnt = 0;
        int index = 0;

        while ((index = str.indexOf(key, index)) != -1) {
            cnt++;
            index += key.length();
        }
        System.out.println("count = " + cnt);
    }
}

// str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
