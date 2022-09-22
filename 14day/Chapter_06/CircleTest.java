//260p 문제 01번 개발자 홍인표 

class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }

}

class ColoredCircle extends Circle {
    String color;

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        ColoredCircle c2 = new ColoredCircle(10, "빨간색");

        c1.show();
        c2.show();
    }
}
