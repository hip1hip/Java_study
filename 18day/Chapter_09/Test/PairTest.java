package Test;

class Pair<T extends Number> {
    private T v1, v2;

    public Pair(T v1, T v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public T first() {
        return v1;
    }

    public T second() {
        return v2;
    }

}

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(10, 20);
        Pair<Double> p2 = new Pair<>(10.0, 20.0);

        System.out.println(p1.first());
        System.out.println(p2.second());
    }
}
