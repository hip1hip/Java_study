package Test;

//p347 문제 04 개발자 홍인표 

class Dice {
    public int roll() {
        return 1 + (int) (Math.random() * 6);
    }

}

public class DiceTest {
    public static void main(String[] args) {
        System.out.println(new Dice().roll());
    }
}
