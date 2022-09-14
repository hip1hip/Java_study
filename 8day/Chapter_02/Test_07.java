import java.util.Scanner;

// 문제 7 정수값 4, 5 로 나누기 

public class Test_07 {
    public static void main(String[] args) {

        boolean and, or;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        and = x % 4 == 0 && x % 5 == 0;
        or = x % 4 == 0 || x % 5 == 0;

        System.out.println(and);
        System.out.println(or);
        System.out.println(or && !and);

    }
}
