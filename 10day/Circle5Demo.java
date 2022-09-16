class Circle03 {
    double radius;
    static int num0fCircles = 0;
    int numCircles = 0;

    public Circle03(double radius) {
        this.radius = radius;
        num0fCircles++;
        numCircles++;
    }
}

public class Circle5Demo {
    public static void main(String[] args) {
        Circle03 myCircle = new Circle03(10.0);
        Circle03 yourCircle = new Circle03(5.0);

        System.out.println("원의 개수 : " + Circle03.num0fCircles);
        System.out.println("원의 개수 : " + yourCircle.numCircles);

    }

    void print() {
        System.out.println("인스턴스 메서드입니다.");
    }

}
