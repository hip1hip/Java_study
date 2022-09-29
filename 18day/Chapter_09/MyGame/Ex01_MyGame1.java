class Npc1 {
    public String toString() {
        return "This is a Npc1.";
    }
}

class HumanCamp1 {
    private Npc1 unit;

    public void set(Npc1 unit) {
        this.unit = unit;
    }

    public Npc1 get() {
        return unit;
    }
}

class Tank1 {
    public String toString() {
        return "This is a Tank1.";
    }
}

class MachineCamp1 {
    private Tank1 unit;

    public void set(Tank1 unit) {
        this.unit = unit;
    }

    public Tank1 get() {
        return unit;
    }

}

public class Ex01_MyGame1 {
    public static void main(String[] args) {
        // 게임종족 생성
        HumanCamp1 human = new HumanCamp1();
        MachineCamp1 machine = new MachineCamp1();

        // 게임 종족에 유닛을 생성해 담기
        human.set(new Npc1());
        machine.set(new Tank1());

        // 게임 종족에서 유닛을 가져오기
        Npc1 hUnit = human.get();
        Tank1 mUnit = machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);

    }
}
