import java.util.Scanner;

class InterruptThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if (Thread.interrupted())
                break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            System.out.println("작업 실행 중...");
        }
        System.out.println("작업 완료.");
    }
}

public class InterruptTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Thread t = new InterruptThread();
        t.start();
        while (true) {
            if (in.nextInt() == 1) {
                t.interrupt();
                break;
            }
        }
    }
}
