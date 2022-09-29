class Npc5 {
    public String toString() {
        return "This is a Npc5.";

    }
}

class Tank5 {
    public String toString() {
        return "This is a Tank5.";

    }
}

class Camp5<T> {
    private T unit;

    public void set(T unit) {
        this.unit = unit;
    }

    public T get() {
        return unit;
    }
}

public class Ex05_MyGame1 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp5<Npc5> human = new Camp5<>();
        Camp5<Tank5> machine = new Camp5<>();

        // 게임 종족에 유닛을 생성해 담기
        // 자식 객체를 부모타입의 변수에 대입
        human.set(new Npc5());
        machine.set(new Tank5());

        Npc5 hUnit = human.get();
        Tank5 mUnit = machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);

    }
}
