import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarDemo {
    public static void main(String[] args) {
        List<Car> dieselCars = findCars(Car.cars, c -> !c.isGasoline());
        System.out.println("디젤 자동차 = " + dieselCars);

        List<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
        System.out.println("오래된 자동차 = " + oldCars);

        List<Car> oldDieselCars = findCars(Car.cars, c -> c.getAge() > 10 && !c.isGasoline());
        System.out.println("오래된 디젤 자동차 = " + oldDieselCars);

        System.out.println("디젤 자동차 = ");
        printCars(dieselCars, c -> System.out.printf("%s(%d))",
                c.getModel(), c.getAge(), c.getMileage()));
    }

    public static List<Car> findCars(List<Car> all, Predicate<Car> cp) {
        List<Car> result = new ArrayList<>();

        for (Car car : all) {
            if (cp.test(car))
                result.add(car);
        }
        return result;
    }

    public static void printCars(List<Car> all, Consumer<Car> cc) {
        for (Car car : all) {
            cc.accept(car);
        }
    }

}
