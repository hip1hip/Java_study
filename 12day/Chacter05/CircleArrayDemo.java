// 개발자 홍인표
//2번쨰 클래스 문단 입력 
class Circle {

    double radius; // 3)오류 해제 실행 확인
    public Circle p;

    public Circle(double radius) {
        this.radius = radius;
    } // 1) 오류

    public double getRadius() {
        return radius;
    } // 4) 정상실행

    double findArea() {
        return 3.14 * radius * radius;
    } // 2)오류
}

// 1번째 메인 문단 입력
public class CircleArrayDemo {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1.0);
            System.out.printf("원의 넓이 ( 반지름 : %.1f ) = %.2f\n",
                    circles[i].radius, circles[i].findArea());
        }
    }
}
