import java.util.Scanner;

//문제 5 
//간단하지만 수정, 개조 후 빈번하게 사용되는 Code!

public class Test_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("입력하세요 : ");
        char c = in.next().charAt(0);

        System.out.printf("대문자는 %c\n", c - ('a' - 'A'));

    }
}
