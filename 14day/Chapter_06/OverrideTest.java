class Vehicle {
    static String color;
    static int speed;

    Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    static void show() {
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + speed);
    }
}

class Car extends Vehicle {
    static int displacement;
    static int gears;

    Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    static void show() {
        System.out.println("색상:" + color);
        System.out.println("속도:" + speed);
        System.out.println("배기량:" + displacement);
        System.out.println("기어 단수:" + gears);
    }

}

public class OverrideTest {
    public static void main(String[] args) {
        Car c = new Car("파랑", 200, 1000, 5);
        c.show();

        System.out.println();
        Vehicle v = c;
        v.show();

    }

}
