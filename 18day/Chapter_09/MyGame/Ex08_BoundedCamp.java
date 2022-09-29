class Camp8<T extends Number> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

public class Ex08_BoundedCamp {
    public static void main(String[] args) {
        Camp8<Integer> iBox = new Camp8<>();
        iBox.set(24);

        Camp8<Double> dBox = new Camp8<>();
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }

}
