import java.util.Scanner;

public class SubMenu {
    public void playGame(Character character) {
        Scanner se = new Scanner(System.in);

        while (true) {
            System.out.println("무엇을 할까요?");
            System.out.println("1. 먹기\t2. 쉬기\t 3. 이동하기\t 4. 훈련\t 5. 종료");
            int menu = Integer.parseInt(se.nextLine());

            if (menu == 1) {
                character.eat();
            } else if (menu == 2) {
                character.sleep();
            } else if (menu == 3) {
                character.play();
                if (!character.checkEnergy()) { // ! : 부정(true -> false, false -> true)
                    System.out.println("에너지가 부족하여 캐릭터가 사망했습니다.");
                    break;
                }
                character.levelUp();

            } else if (menu == 4) {
                character.train();
                if (!character.checkEnergy()) {
                    System.out.println("에너지가 부족하여 캐릭터가 사망했습니다.");
                    break;
                }
                character.levelUp();
            } else if (menu == 5) {
                System.out.println("게임을 종료합니다!");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            } // if
            character.printInfo();
        } // while
        se.close();
    }
}
