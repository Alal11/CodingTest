public class M1_2 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] splitArray = email.split("@");

        System.out.println("ID: " + splitArray[0]);
        System.out.println("Domain: " + splitArray[1]);
    }
}

// split() 함수를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
