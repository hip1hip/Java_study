//165p 문제 05번 개발자 홍인표

class Line {

    int length;

    public Line(int length) {
        this.length = length;
    }

    boolean isSameLine(Line o) {
        return o.length == length;
    }

}

public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
