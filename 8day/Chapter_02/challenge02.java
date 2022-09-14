import java.util.Scanner;

//76p 도전과제 02

public class challenge02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int a = in.nextInt();
        System.out.println(a % 2 == 0 ? "짝수" : "홀수");

    }

}