public class Switch5Demo {
    public static void main(String[] args) {
        System.out.println(howMany(1) + "있다.");
        System.out.println(howMany(2) + "있다.");
        System.out.println(howMany(3) + "있다.");
    }

    static String howMany(int n) {
        return switch (n) {
            case 1 -> "1개";
            case 2 -> "2개";

            default -> "많이";

        };
    }

}
