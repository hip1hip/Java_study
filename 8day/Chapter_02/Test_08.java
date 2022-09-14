import java.util.Scanner;

//문제 8번 0~999 각 자릿수 더하기 

public class Test_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("0~999 입력하세요 : ");

        int x = in.nextInt();

        // 194 을 입력하면
        int sum;
        sum = x % 10; // 190 -> 4

        x /= 10; // 190/10 = 19

        sum += x % 10; // 10 -> 9 = 9+4=13

        x /= 10; // 10/10 = 1

        sum += x % 10; // 1 + 13 = 14

        System.out.print("각 자리수의 합 = " + sum);
    }
}
