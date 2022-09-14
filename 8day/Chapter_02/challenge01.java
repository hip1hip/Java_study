import java.util.Scanner;

//75p 도전과제 01

public class challenge01 {
    public static void main(String[] args) {
        // double w, h, area;

        Scanner in = new Scanner(System.in);

        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        double w = in.nextDouble();
        System.out.print("직사각형의 세로 길이를 입력하세요 : ");
        double h = in.nextDouble();

        System.out.printf("직사각형의 넓이는 %-4.1f 입니다.\n", w * h);
    }
}

/*
 * double w, h, area;
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("직사각형의 가로 길이를 입력하세요 : ");
 * w = in.nextDouble();
 * System.out.print("직사각형의 세로 길이를 입력하세요 : ");
 * h = in.nextDouble();
 * 
 * area = w * h;
 * System.out.println("직사각형의 넓이는 " + area + "입니다.");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */