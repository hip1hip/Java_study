public class UpcastDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();

        p = s;

        // p.number = 1;
        // p.work();
        p.whoami();
        // whoami();
    }
}
