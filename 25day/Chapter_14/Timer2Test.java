import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Timer2Test {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1;; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println(i);
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.submit(task);

    }

}
