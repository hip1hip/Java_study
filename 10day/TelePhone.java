//Coding by 홍인표

class Phone {
    String model;
    int value;

    void print() {
        System.out.println(value + "만원 짜리 " + model + " 스마트폰");
    }
}
// model과 value라는 필드와 print() 메서드를 가진 클래스이다.

public class TelePhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone(); // Phone 타입의 객체를 생성한 후 myPhone이라는 참조 변수에 대입한다.
        myPhone.model = "갤럭시 노트 20";
        myPhone.value = 100; // 객체에 필드에 값을 대입한다.
        myPhone.print(); // 객체의 메서드를 호출한다.

        Phone yourPhone = new Phone();
        yourPhone.model = "아이폰 14";
        yourPhone.value = 140;
        yourPhone.print();

    }
}
