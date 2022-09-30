package Tset;

import java.util.function.Consumer;

public class PlusralTest {
    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println(
                x == 1 ? "1 apple." : x.toString() + " apples.");
        consumer.accept(3);
        consumer.accept(1);
    }
}
