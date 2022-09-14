import java.util.Scanner;

public class TotalRun {

    public static void main(String[] args) {

        {

            int row = 2;
            do {
                int column = 1;
                do {
                    System.out.printf("%4d", row * column);
                    column++;
                } while (column < 10);
                System.out.println();
                row++;
            } while (row < 10);

        }

        {
            int i = 1;
            while (i < 10) {
                System.out.println(i);
                i++;

            }
        }
        {
            Scanner in = new Scanner(System.in);
            System.out.print("숫자를 입력하세요 : ");
            int number = in.nextInt();

            if (number % 2 == 0)
                System.out.println("짝수!");
            if (number % 2 == 1)
                System.out.println("홀수!");
            System.out.println("종료");

        }
        {
            int row = 2;
            while (row < 20) {
                System.out.printf("%d X %d = %d", row, row, row * row);
                System.out.println();
                row++;

            }

        }
        {
            int row = 2;
            {
                int column = 1;
                do {
                    System.out.printf("%4d", row * column);
                    column++;
                } while (column < 10);
                System.out.println();
                row++;
            }
            while (row < 10)
                ;
        }

    }

}