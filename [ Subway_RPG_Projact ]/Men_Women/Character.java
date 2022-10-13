
//22.10.13_개발자_홍인표_2일차

public abstract class Character { // abstract 추상클래스
    // 맴버 변수 선언
    protected int exp;
    protected int energy;
    protected int level;

    // 추상 메소드
    // 1. 먹기\t2. 쉬기\t 3. 이동하기\t 4. 훈련\t 5. 종료"
    public abstract void eat();

    public abstract void sleep();

    public abstract boolean play(); // play , traun 은 에너지가 감소 , 죽음

    public abstract boolean train();

    public abstract void levelUp();

    // 에너지 체크
    public boolean checkEnergy() {
        if (energy > 0) {
            return true;
        } else {
            return false;
        }
    }

    // 현재 캐릭터의 상태를 출력
    public void printInfo() {
        System.out.println("===================================");
        System.out.println("현재 캐릭터의 정보를 출력합니다.");
        System.out.println("경험치 : " + exp);
        System.out.println("에너지 : " + energy);
        System.out.println("레벨 : " + level);
        System.out.println("======================================");
    }

}
