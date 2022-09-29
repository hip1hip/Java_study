interface Unit6 {
    void move(String s);
}

// class Human5 implements Unit5 {
// public void move(String s) {
// System.out.println(s);
// }
// }

public class Ex06_Lambda2 {
    public static void main(String[] args) {
        Unit6 unit = new Unit6() {
            public void move(String s) {
                System.out.println(s);
            }
        };
        unit.move("named : Unit 6");
    }
}