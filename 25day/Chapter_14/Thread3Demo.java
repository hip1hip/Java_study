public class Thread3Demo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("잘가아. ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }
        };
        new Thread(task).start();
    }
}
