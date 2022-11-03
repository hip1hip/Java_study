import java.util.Random;

public class MainGame {

    Character c;
    Item[] items;

    MainGame() {
        c = new Character("홍길동", 80, 50, 40, 10);

        items = new Item[10];
        items[0] = new Item("대검", 0, 0, 10, 0);
        items[1] = new Item("갑옷", 0, 0, 0, 10);
        items[2] = new Item("가시갑옷", 0, 0, 0, 0);
        items[3] = new Item("롱소드", 0, 0, 0, 0);
        items[4] = new Item("창", 0, 0, 0, 0);
        items[5] = new Item("지팡이", 0, 0, 0, 0);
        items[6] = new Item("할버드", 0, 0, 0, 0);
        items[7] = new Item("방패", 0, 0, 0, 0);
        items[8] = new Item("투구", 0, 0, 0, 0);
        items[9] = new Item("책", 0, 0, 0, 0);

    }

    public static void main(String[] args) {
        new MainGame().start();
    }

    String[] subway = new String[] { "문산", "파주", "월롱", "금촌", "금릉", "운정", "야당", "탄현", "일산", "풍산", "백마",
            "곡산", "대곡", "능곡", "행신", "강매", "화전", "수색", "디엠씨", "가좌", "신촌", "서울" };

    void start() {
        int input = 0;
        while (true) {

            System.out.println("1.내정보\t2.사냥\t3.탈출");
            input = ScanUtil.nextInt();
            switch (input) {
                case 1:
                    c.showInfo();
                    break;
                case 2:

                    hunt();

                    break;

                case 3:
                    System.out.println("탈출하였습니다.");
                    System.exit(0);
                    break;
            }
        }
    }

    void hunt() {
        for (int i = 1; i <= subway.length; i++) {
            System.out.println("이번역은 " + subway[i] + "역 입니다. ");

            Monster m = new Monster("123", 50, 10, 20, 10, 5, 5, new Item[] { items[0],
                    items[1], items[2], items[3], items[4], items[5], items[6], items[7], items[8], items[9] });
                    

            System.out.println(m.name + "을 만났습니다. 전투를 시작합니다.");

            int input = 0;
            battle: while (true) {
                System.out.println("1. 공격 \t 2. 도망");
                input = ScanUtil.nextInt();

                switch (input) {
                    case 1:
                        c.attack(m);
                        if (m.hp < 1) {
                            System.out.println(m.name + "을 처치하였습니다.");
                            c.getExp(100);
                            c.getItem(m.itemDrop());
                            break battle;
                        }
                        m.attack(c);
                        break;
                    case 2:
                        System.out.println("도망쳤습니다.");
                        break battle;
                }

            }
            if (i == 22) {
                System.out.println("종착역입니다. 게임을 종료합니다.");
                System.exit(0);
            }

        }

    }
}