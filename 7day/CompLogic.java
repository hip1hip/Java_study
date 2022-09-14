public class CompLogic {
    public static void main(String[] args) {
        int x = 0, y = 1;
        System.out.println((x < 1) || (y-- < 1));
        System.out.println(" x = " + x + ", y = " + y);

        // x = 0;
        // y = 2;
        System.out.println((x < 1) | (y-- < 1));
        System.out.println("x = " + x + " , y = " + y);

    }
}
