import java.util.Scanner;

//문제 4번

public class Tset_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 :  ");
        int a = in.nextInt();

        System.out.printf("%d시간 %d분  %d초\n", a / 60, a / 60, a % 60);
    }
}
