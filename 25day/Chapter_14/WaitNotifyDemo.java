class TotalThread extends Thread {
    int total;

    public void run() {
        synchronized (this) {

            for (int i = 1; i <= 100; i++)
                total += i;
            notify();
        }
    }

}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        TotalThread t = new TotalThread();
        t.start();
        synchronized (t) {
            try {
                System.out.println("스레드t 가 끝날 떄 까지 대기...");
                t.wait();

            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("총합 :" + t.total);
        }
    }
}
