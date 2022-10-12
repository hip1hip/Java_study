
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("어여가. ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(task);

        for (int i = 0; i < 5; i++) {
            System.out.println("하이이 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        exec.shutdown();
    }

}
