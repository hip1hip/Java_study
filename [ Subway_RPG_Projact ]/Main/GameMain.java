
// 22.10.25 개발자 홍인표 

public class GameMain {

    static Character c = new Character(null, 0, 0, 0, 0);
    static Event even;

    public static void main(String[] args) {

        String[] subway = new String[] { "문산", "파주", "월롱", "금촌", "금릉", "운정", "야당", "탄현", "일산" };
        int input = 0;

        System.out.println(" 서브웨이 RPG \n");

        GAME: while (true) {
            for (int i = 1; i <= subway.length;) {
                System.out.println("1. 내정보 \t2. 다음역 이동하기 ");

                input = ScanUtil.nextInt();

                switch (input) {
                    case 1:

                        c.showInfo();
                        break;
                    case 2:
                        i++;
                        if (i % 5 == 0) {
                            System.out.println("이번역은 " + subway[i] + "역 입니다. ");
                            System.out.println("엘리트 몬스터 발생");
                            Monster.Elite(c);
                        } else {
                            System.out.println("이번역은 " + subway[i] + "역 입니다. ");
                            Event.showEven();
                            break;
                        }

                }
            }
        }

    }
}
