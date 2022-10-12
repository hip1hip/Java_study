public class Thread2Test {
    public static void main(String[] args) {
        new Sync2Thread("속담1 : ").start();
        new Sync2Thread("속담2 : ").start();
    }
}

class Sync2Thread extends Thread {
    static String proverb[] = { "Time", "is", "money" };

    public Sync2Thread(String id) {
        super(id);

    }

    public void run() {
        Utils2.show(getName(), proverb);
    }
}

class Utils2 {
    static synchronized void show(String name, String list[]) {
        for (int i = 0; i < list.length; i++) {
            try {
                Thread.sleep((long) (100 * Math.random()));
            } catch (InterruptedException x) {
                // TODO: handle exception
            }
            System.out.println(name + list[i]);
        }
    }
}