import java.util.Scanner;

//문제 4번

public class Test_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 :  ");
        int t = in.nextInt(); // 400대입
        int s = t % 60; // 6이 남음
        int m = (t / 60) % 60; // 6.66666
        int h = (t / 60) / 60;

        System.out.printf("%d시간 %d분  %d초\n", h, m, s);
    }
}
