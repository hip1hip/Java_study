package sec06.other;

import sec06.One;

public class One2 extends One {
    void print() {
        // System.out.println(secret); // 자식 클라스라도 부모와 다른 패키지면 private , default 맴버 접근
        // 불가
        // System.out.println(roommate);
        System.out.println(child);
        System.out.println(anybody);
    }
}
