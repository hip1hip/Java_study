class Npc3 {
    public String toString() {
        return "This is a Npc3.";

    }
}

class Tank3 {
    public String toString() {
        return "This is a Tank3.";

    }
}

class Camp3 {
    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }
}

public class Ex01_MyGame3 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp3 human = new Camp3();
        Camp3 machine = new Camp3();

        // 게임 종족에 유닛을 생성해 담기
        // 자식 객체를 부모타입의 변수에 대입
        human.set("난 공룡");
        machine.set("난 우주인");

        // 유닛 가져오기
        // 형변환 필요
        Npc3 hUnit = (Npc3) human.get();
        Tank3 mUnit = (Tank3) machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);

    }
}
