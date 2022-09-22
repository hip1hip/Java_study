package sec06;

public class One1 extends One {

    void print() {
        // System.out.println(secret); // 같은 패키지에 있는 자식객체라도 private 접근 불가
        System.out.println(roommate);
        System.out.println(child);
        System.out.println(anybody);

    }
    // void show() {} //오버라이딩 할 때 접근 범위가 좁아지면 오류
}
