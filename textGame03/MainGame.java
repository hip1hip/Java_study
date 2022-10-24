import java.util.Scanner;

public class MainGame {

    Character c;
    Item[] items;

    MainGame() {
        c = Character("홍길동", 80, 50, 20, 10);

        items = new Item[10];
        items[0] = new Item("대검", 0, 0, 10, 0);
        items[0] = new Item("갑옷", 0, 0, 0, 10);

    }

    public static void main(String[] args) {
        new MainGame().start();
    }

    void start() {
        int input = 0;
        while (true) {
            System.out.println("1. 내정보 \t2.사냥 \t3.탈출");
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
        Monster m = new Monster("고블린", 50, 10, 5);
        System.out.println(m.name + "을 만났습니다. 전투를 시작합니다.");

        int input = 0;
        battle: while (true) {
            System.out.println("1. 공격 \t 2. 도망");
            input = ScanUtil.nextInt();

            switch (input) {
                case 1:
                    c.attack(m);
                    if (m.hp <= 0) {
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

    }

}
