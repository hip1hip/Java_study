// Coding by Hong In Pyo

class Circle {
    double radius;
    // 초기화 하지 않았으므로 기본값인 0.0이 된다.

    double findArea() {
        return 3.14 * radius * radius;

    }

    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        // 생성자(Constructor)를 호출해 Circle 객체를 생성한다.

        myCircle.radius = 10.0;
        // myCircle 객체의 radius 필드를 의미한다.

        myCircle.show(myCircle.radius, myCircle.findArea());
        // myCircle 객체의 show()와 findArea() 메서드를 의미한다.

    }

}
