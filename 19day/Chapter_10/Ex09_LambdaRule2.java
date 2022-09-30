interface Unit9 {
    int calc(int a, int b);
}

public class Ex09_LambdaRule2 {
    public static void main(String[] args) {
        Unit9 unit;
        unit = (a, b) -> {
            return a + b;
        };

        int num = unit.calc(10, 20);
        System.out.println(num);

        unit = (a, b) -> a * b;
        System.out.println(unit.calc(10, 20));

    }
}