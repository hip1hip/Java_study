import java.util.Scanner;

//문제 6 화씨 섭씨  

public class Test_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("화씨온도 : ");
        double f = in.nextDouble();
        double c = (5.0 / 9.0) * (f - 32.0);
        System.out.println("섭씨온도는 " + c);

    }
}
