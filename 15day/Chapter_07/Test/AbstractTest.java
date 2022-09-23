package Test;

//p302 문제 01번 개발자 홍인표

abstract class Abstract {
    int i;

    public Abstract(int i) {
        this.i = i;
    }

    abstract void show();
}

class Concrete extends Abstract {
    int j;

    public Concrete(int i, int j) {
        super(i);
        this.j = j;
    }

    void show() {
        System.out.println("i= " + i + ", j = " + j);
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }

}
