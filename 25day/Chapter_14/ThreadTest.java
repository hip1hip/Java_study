import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String[] args) {
        int alphabet = 'a';
        ExecutorService exec = Executors.newCachedThreadPool();
        Runnable task = () -> {

            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("작업 스레드 : " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            exec.shutdown();
        };
        exec.submit(task);
        try {
            while (!exec.isShutdown()) {
                System.out.println("메인 스레드 : " + (char) alphabet++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}

// ================================================================
// public class ThreadTest {
// public static void main(String[] args) {
// int alphabet = 'a';
// Thread worker = new Thread(() -> {

// try {
// for (int i = 0; i < 5; i++) {
// System.out.println("작업 스레드 : " + i);
// Thread.sleep(1000);
// }
// } catch (InterruptedException e) {
// // TODO: handle exception
// }
// });
// worker.start();
// try {
// while (worker.isAlive()) {
// System.out.println("메인 스레드 : " + (char) alphabet++);
// Thread.sleep(500);
// }
// } catch (InterruptedException e) {
// // TODO: handle exception
// }
// }
// }
// ================================================================
// class Worker extends Thread {
// public void run() {
// try {
// for (int i = 0; i < 5; i++) {
// System.out.println("작업 스레드 : " + i);
// Thread.sleep(1000);
// }
// } catch (InterruptedException e) {
// }
// }
// }
// public class ThreadTest {
// public static void main(String[] args) {
// int alphabet = 'a';
// Worker worker = new Worker();
// worker.start();
// try {
// while (worker.isAlive()) {
// System.out.println("메인 스레드 :" + (char) alphabet++);
// Thread.sleep(500);
// }
// } catch (InterruptedException e) {
// // TODO: handle exception
// }
// }
// }
