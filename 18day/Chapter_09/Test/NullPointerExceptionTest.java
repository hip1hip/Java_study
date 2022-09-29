package Test;

class MyDate {
    int year = 2035;
    int month = 12;
    int day = 25;
}

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        MyDate d = null;

        try {
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);

        } catch (NullPointerException e) {
            d = new MyDate();
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);

        }
    }

}
