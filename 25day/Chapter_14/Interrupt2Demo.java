public class Interrupt2Demo {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("실행중.......");

            }
            System.out.println("정상종료");
        };

        Thread t = new Thread(task);
        t.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        t.interrupt();
    }
}
