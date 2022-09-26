package sec02;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = new String("hi");
        System.out.println(s.hashCode());
        s = s + "!";
        System.out.println(s.hashCode());

        StringBuilder sb = new StringBuilder("hi");
        System.out.println(sb.hashCode());
        sb = sb.append("!");
        System.out.println(sb.hashCode());

        System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java ,"));
    }
}
