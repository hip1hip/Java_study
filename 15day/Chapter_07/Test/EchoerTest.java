package Test;

abstract class Echoer {
    void start() {
        System.out.println("시작합니다.");
    }

    abstract void echo();

    void stop() {
        System.out.println("종료합니다.");
    }
}

public class EchoerTest {

}
