package Test;

// p303 문제 04 개발자 홍인표

interface Talkable {
    void talk();
}

class Korean implements Talkable {
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable {
    public void talk() {
        System.out.println("Hello!");
    }
}

public class TalkableTest {
    static void speak(Talkable t) {
        t.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());

    }
}
