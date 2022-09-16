// Coding by Hong In Pyo

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    double findArea() {
        return 3.14 * radius * radius;

    }

    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
    }
}

public class Circle2Demo {

    public static void main(String[] args) {
        Circle myCircle = new Circle();

        myCircle.setRadius(10.0);

        myCircle.show(myCircle.getRadius(), myCircle.findArea());

    }

}
