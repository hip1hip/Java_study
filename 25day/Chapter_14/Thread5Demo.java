public class Thread5Demo {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("잘가아");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                    }
                }
            }
        }.start();
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
