
public class String1Demo {
    public static void main(String[] args) {
        String s1 = "Hi , Java!"; // 문자열 리터럴을 사용해 String 타입의 s1 변수를 최기화 한다.
        String s2 = "Hi , Java!";
        String s3 = new String("Hi , Jaca!"); // 새로운 문자열 객체를 생성해 String 타입의 s3 변수를 초기화 한다.
        String s4 = new String("Hi , Jaca!");

        System.out.println("s1 == s2 -> " + (s1 == s2)); // s1 과 s2 문자열 객체가 동일한 객체를 가리키는지 조사한다.
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println("s3 == s4 -> " + (s3 == s4));

        s1 = s3;
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println(s3);

        s4 = s2;
        System.out.println(s4);
    }

}