public class MemberDemo {
    class Eagle extends Bird {
        public void move() {
            System.out.println("독수리가 난다~");

        }

        public void sound() {
            System.out.println("휘익~");
        }
    }

    Eagle e = new Eagle();

    public static void main(String[] args) {
        MemberDemo m = new MemberDemo();
        m.e.move();
        m.e.sound();
    }

}
