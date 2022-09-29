package Test;

class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

public class CastExceptionTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("타입을 변환을 할 수 없습니다.");
        }

    }

    static void casting(Shape s) throws ClassCastException {
        Circle c = (Circle) s;
    }
}
