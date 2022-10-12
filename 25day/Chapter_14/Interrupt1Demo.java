public class Interrupt1Demo {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                while (true) {
                    System.out.println("실행중...");
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                // TODO: handle exception
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
