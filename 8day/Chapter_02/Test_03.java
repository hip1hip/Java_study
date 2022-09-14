import java.util.Scanner;

//80p 문제 03

public class Test_03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        int a = in.nextInt();
        System.out.print("원기둥의 높이는?  ");
        int b = in.nextInt();

        System.out.printf("원기둥의 부피는 %-4.1f\n", 3.14 * a * b * a);

    }
}
