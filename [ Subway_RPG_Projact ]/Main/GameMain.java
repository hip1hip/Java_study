
// 22.10.25 개발자 홍인표 

public class GameMain {

    static Character c = new Character(null, 0, 0, 0, 0);
    static Event even;
    static Monster elite;

    public static void main(String[] args) {

        String[] subway = new String[] { "문산", "파주", "월롱", "금촌", "금릉", "운정", "야당", "탄현", "일산" };
        int input = 0;

        System.out.println(" 서브웨이 RPG \n");

        for (int i = 1; i <= subway.length; i++) {
            while (true) {
                System.out.println("1. 내정보 \t2. 전진하기");

                input = ScanUtil.nextInt();

                switch (input) {
                    case 1:

                        c.showInfo();
                        break;
                    case 2:
                        if (i % 5 == 0) {
                            System.out.println(subway[i] + "역 입니다. ");
                            System.out.println("엘리트 몬스터 발생");
                            elite.Elite();
                        } else {
                            System.out.println(subway[i] + "역 입니다. ");
                            Event.showEven();
                            break;
                        }

                }
            }
        }

    }
}
