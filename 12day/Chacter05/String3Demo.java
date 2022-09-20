public class String3Demo {
    public static void main(String[] args) {
        String s1 = new String("Hi,");
        String s2 = new String(" Java");

        System.out.println("문자열 길이(s1) : " + s1.length());
        System.out.println(s1.charAt(1));

        s1 = s1.concat(s2);

        System.out.println(s1.concat(s2) + "!");
        System.out.println(s1.toLowerCase() + "!");
        System.out.println(s1.substring(4, 8) + "!");

        String s3 = " ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
        String s4 = "";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());

        String s5 = "*-*";
        System.out.println(s5.repeat(10));
        String s6 = "홍인표-홍인표";
        System.out.println(s6.repeat(5));

        System.out.println(s2.trim().indexOf("v"));

    }
}
