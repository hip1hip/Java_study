package Test;

///p307 문제 09번 개발자 홍인표

class Hotel { // 외부클래스이다

    int roomNum;
    String name;

    class Room { // 내부클래스

        public void add(int i, String string) {
            System.out.println(Hotel.this.roomNum + "번 방을 " + Hotel.this.name + "님이 예약하했습니다.");
            System.out.println(Hotel.this.roomNum + "번 방을 " + Hotel.this.name + "님이 예약하했습니다.");

        }

        public void show() {

        }

    }

}

public class HotelTest {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Hotel.Room h1 = hotel.new Room();
        h1.add(5, "홍광석");
        h1.add(7, "전금순");
        h1.show();
    }
}
