import java.util.*;
import java.text.SimpleDateFormat;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> s1 = () -> "apple";
        System.out.println(s1.get());

        int[] x = { 0 };
        IntSupplier s2 = () -> x[0]++;

        DoubleSupplier s3 = () -> Math.random() * 10;
        System.out.println(s3.getAsDouble());

        SimpleDateFormat format = new SimpleDateFormat("MM월 dd일 (E요일) a hh:mm:ss");
        Supplier<String> s4 = () -> format.format(new Date());

        System.out.println(s4.get());

    }
}
