package Tset;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class ConvertTest {
    public static void main(String[] args) {
        ToIntFunction<Integer> c1 = i -> Integer.toString(i).length();
        System.out.println("ToIntFunction : ");
        System.out.printf("length(10) = %d\n", c1.applyAsInt(10));
        System.out.printf("length(100) = %d\n", c1.applyAsInt(100));
        System.out.printf("length(1000) = %d\n", c1.applyAsInt(1000));

        UnaryOperator<Integer> c3 = i -> Integer.toString(i).length();
        System.out.println("\nUnaryOperator : ");
        System.out.printf("length(10) = %d\n", c3.apply(10));
        System.out.printf("length(100) = %d\n", c3.apply(100));
        System.out.printf("length(1000) = %d\n", c3.apply(1000));
    }
}
