class Npc6 {
    public String toString() {
        return "This is a Npc6.";

    }
}

class Tank6 {
    public String toString() {
        return "This is a Tank6.";

    }
}

class Camp6<T> {
    private T unit;

    public void set(T unit) {
        this.unit = unit;
    }

    public T get() {
        return unit;
    }
}

public class Ex06_MyGame2 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp6<Npc6> human = new Camp6<>();
        Camp6<Tank6> machine = new Camp6<>();

        // 게임 종족에 유닛을 생성해 담기
        human.set(new Npc6());
        machine.set(new Tank6());

        Npc6 hUnit = human.get();
        Tank6 mUnit = machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);

    }
}
