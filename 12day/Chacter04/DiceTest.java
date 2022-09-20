//167p 문제08번 개발자 홍인표

class Dice {

    int face;

    int roll() {
        return (int) ((Math.random() * 6) + 1);
    }

}

public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위 숫자 : " + d.roll());
    }
}
