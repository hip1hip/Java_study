import java.util.Scanner;

public class Test03_Dowhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, even = 0;
        do {
            System.out.println("양의 정수 :");
            x = in.nextInt();
            if (x % 2 == 0)
                even += x;
        } while (x > 0);
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + even);

    }
}
