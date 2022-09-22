package sec06.other;

import sec06.One;

public class Three {
    void print() {
        One o = new One();
        // System.out.println(o.secret);
        // System.out.println(o.roommate);
        // System.out.println(o.child);
        System.out.println(o.anybody); // 다른 패키지 클라스는 public 맴버만 접근 가능
    }
}
