package sec04;

import java.util.ArrayList;

import sec03.Beer;
import sec03.Beverage;

public class GenericInheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Beverage> list1 = new ArrayList<>();
        list1.add(new Beer());
        beverageTest(list1);

        ArrayList<Beer> list2 = new ArrayList<>();
        list2.add(new Beer());

    }

    static public void beverageTest(ArrayList<Beverage> list) {
    }
}
