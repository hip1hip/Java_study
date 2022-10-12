class WorkerThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("잘가렴. ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}

public class Thread4Demo {
    public static void main(String[] args) {
        Thread t = new WorkerThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("안녕~");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
