package Test;

// p306 문제 07 개발자 홍인표

interface Flyable {
    void speed();

    void height();
}

public class FlyableTest {
    public static void main(String[] args) {
        Flyable f = new Flyable() {
            @Override
            public void speed() {
                System.out.println("속도");
            }

            @Override
            public void height() {
                System.out.println("높이");
            }
        };
        f.speed();
        f.height();
    }
}
