interface Unit10 {
    String move();
}

public class Ex10_LambdaRule3 {
    public static void main(String[] args) {
        Unit10 unit = () -> {
            return "인간형 유닛 이동";
        };
        System.out.println(unit.move());
    }
}
