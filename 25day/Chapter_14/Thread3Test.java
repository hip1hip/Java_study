public class Thread3Test {
    public static void main(String[] args) {
        Utils3 s = new Utils3();
        new Sync3Thread("속담1 : ", s).start();
        new Sync3Thread("속담2 : ", s).start();

    }

}

class Sync3Thread extends Thread {
    static String proverb[] = { "Time", "is", "money" };
    Utils3 s;

    public Sync3Thread(String id, Utils3 s) {
        super(id);
        this.s = s;
    }

    public void run() {
        synchronized (s) {
            s.show(getName(), proverb);
        }
    }
}

class Utils3 {
    void show(String name, String list[]) {
        for (int i = 0; i < list.length; ++i) {
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException x) {

            }
            System.out.println(name + list[i]);
        }
    }
}
