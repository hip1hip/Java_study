package sec03;

interface Portable {
    void inMyBag();
}

public class PS5 extends Computer implements Portable {
    public void inMyBag() {
        System.out.println("PS5은 가방에 있다.");
    }

    public void turnOn() {
        System.out.println("PS5을 켠다.");
    }

    public void turnOff() {
        System.out.println("PS5을 끈다.");
    }

    public static void main(String[] args) {
        PS5 p = new PS5();

        p.turnOn();
        p.turnOff();
        p.inMyBag();
    }
}
