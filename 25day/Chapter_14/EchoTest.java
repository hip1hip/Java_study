public class EchoTest {
    public static void main(String[] args) {
        Echo echo = new Echo();
        new Echoer("환영", echo).start();
        new Echoer("야호~~~", echo).start();
        new Echoer("자바", echo).start();
    }

}

class Echoer extends Thread {
    String msg;
    Echo echo;

    public Echoer(String msg, Echo echo) {
        this.msg = msg;
        this.echo = echo;
    }

    @Override
    public void run() {
        echo.echo(msg);
    }
}

class Echo {
    // public void echo (String msg) { 동기화 하지 않을때
    public synchronized void echo(String msg) {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(msg);
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }

    }
}
