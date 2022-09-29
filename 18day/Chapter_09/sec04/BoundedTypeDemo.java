package sec04;

import sec03.Beer;
import sec03.Beverage;
import sec03.Boricha;
import sec04.*;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Cup<Beer> c1 = new Cup<>();
        Cup<Boricha> c2 = new Cup<>();
    }
}

class Cup<T extends Beverage> {
    private T beverage;

    public T getBeverage() {
        return beverage;
    }

    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
}
