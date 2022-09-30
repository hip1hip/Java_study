package Tset;

import java.util.function.UnaryOperator;

public class FirstStringTest {
    public static void main(String[] args) {
        FirstString f = new FirstString();
        UnaryOperator<String> o = f::startsWith;
        System.out.println(o.apply("Hello!"));
    }
}

class FirstString {
    String startsWith(String s) {
        return Character.toString(s.charAt(0));
    }
}
