// class Circle02 {
// double radius;
// String color;

// public Circle02(double r, String c) {
// radius = r;
// color = c;
// }

// public Circle02(double r) {
// radius = r;
// color = "파랑";
// }

// public Circle02(String c) {
// radius = 10.0;
// color = c;

// }

// public Circle02() {
// radius = 10.0;
// color = "빨강";
// }

// }

// public class Circle4Demo {
// public static void main(String[] args) {
// Circle02 c1 = new Circle02(10.0, "빨강");
// System.out.println(c1);

// Circle02 c2 = new Circle02(5.0);
// System.out.println(c2);

// Circle02 c3 = new Circle02("노랑");
// System.out.println(c3);

// Circle02 c4 = new Circle02();
// System.out.println(c4);

// Circle02 c5 = new Circle02("파랑");
// System.out.println(c5);
// }
// }

class Circle02 {
    double radius;
    String color;

    public Circle02(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle02(double radius) {
        this(radius, "파랑");
    }

    public Circle02(String color) {
        this(10.0, color);

    }

    public Circle02() {
        this(10.0, "빨강");
    }

    public void hi() {
        System.out.println("hihi");
    }

}

public class Circle4Demo {
    public static void main(String[] args) {
        Circle02 c1 = new Circle02(10.0, "빨강");
        System.out.println(c1);

        Circle02 c2 = new Circle02(5.0);
        System.out.println(c2);

        Circle02 c3 = new Circle02("노랑");
        System.out.println(c3);

        Circle02 c4 = new Circle02();
        System.out.println(c4);

        Circle02 c5 = new Circle02("파랑");
        System.out.println(c5);
    }
}
