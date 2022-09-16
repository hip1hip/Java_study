public class Test05_ForFor {

    public static void main(String[] args) {
        int a, b, c;

        for (a = 1; a <= 20; a++) {
            for (b = 1; b <= 20; b++) {
                for (c = 1; c <= 20; c++) {
                    if (a * a + b * b == c * c)
                        System.out.printf("%2d, %2d , %2d\n", a, b, c);

                }
            }
        }

    }

}
