//165p 문제 04번 개발자 홍인표 

class Car {
    String color;
    static int numOfCar = 0;
    static int numOfRedCar = 0;

    public Car(String color) {
        this.color = color;
        numOfCar++;
        if (color.equals("red") || color.equals("RED")) {
            numOfRedCar += 1;
            numOfCar += 1;
        } else {
            numOfCar += 1;
        }
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }

}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",
                Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}
