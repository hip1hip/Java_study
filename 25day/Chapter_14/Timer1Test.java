public class Timer1Test implements Runnable {
    public static void main(String[] args) {
        new Thread(new Timer1Test()).start();

    }

    @Override
    public void run() {
        for (int i = 1;; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println(i);
        }
    }

}
