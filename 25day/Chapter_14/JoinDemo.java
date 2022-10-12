class JoinThread extends Thread {
    int total;

    public void run() {
        for (int i = 1; i <= 100; i++)
            total += i;
    }

}

public class JoinDemo {
    public static void main(String[] args) {
        JoinThread t = new JoinThread();
        t.start();

        try {
            t.join();
            System.out.println("스레드t 가 끝날 떄 까지 대기...");
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("총합 :" + t.total);
    }
}
