import java.util.Random;

public class Event {

    static void showEven() {
        Random rand = new Random();

        System.out.println("열차가 정차했습니다. 이벤트가 발생 합니다.");
        int eventNum = 5; // 이벤트 갯수
        int random = rand.nextInt(eventNum); // 랜덤

        switch (random) {
            case 0:
                System.out.println("0출력 ");
                System.out.println("아이템 획득 ");
                Item.item();

                break;
            case 1:
                System.out.println("1출력 ");
                System.out.println("몬스터 조우 ");
                Monster.monster(null);

                break;
            case 2:
                System.out.println("2출력 ");
                System.out.println("몬스터 조우");
                Monster.monster(null);
                break;
            case 3:
                System.out.println("3출력 ");
                System.out.println("경험치 증가 ");

                break;

            case 4:
                System.out.println("4출력 ");
                System.out.println("함정 hp 감소  ");

                break;
        }
    }
}