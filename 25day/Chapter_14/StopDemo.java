class StopThread extends Thread {
    public boolean stop;

    public void run() {
        while (!stop) {
            System.out.println("실행중 ...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        System.out.println("정상 종료");
    }
}

public class StopDemo {
    public static void main(String[] args) {
        StopThread t = new StopThread();
        t.start();

        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        t.stop = true;
    }
}
