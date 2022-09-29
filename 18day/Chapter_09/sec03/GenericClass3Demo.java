package sec03;

public class GenericClass3Demo {

    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Beer());

        // Beer b1 = c.getBeverage();

        // c.setBeverage(new Boricha());
        Beer beer = (Beer) c.getBeverage();
    }
}
