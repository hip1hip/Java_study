import java.util.Scanner;

//80p 문제 02

public class Tset_02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int a = in.nextInt();
        System.out.printf("%d의 제곱은 %d\n", a, a * a);
    }
}
