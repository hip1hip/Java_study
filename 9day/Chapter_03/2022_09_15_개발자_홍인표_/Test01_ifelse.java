import java.util.Scanner;

public class Test01_ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int number = in.nextInt();

        if (number < 19)
            System.out.println("미성년");
        else
            System.out.println("성년");

    }
}
