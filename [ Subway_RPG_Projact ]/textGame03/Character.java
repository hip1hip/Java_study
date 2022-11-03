import java.util.Random;

public class Character {
    String name; //
    int maxHp;
    int maxMp;
    int hp;
    int mp;
    int att;
    int def;
    int level;
    int exp;
    int maxExp;
    Item[] items;
    Random rand = new Random();

    Character(String name, int hp, int mp, int att, int def) { // 생성자를 만들어 변수 초기화
        this.name = name;
        this.maxHp = hp;
        this.maxMp = mp;
        this.hp = maxHp;
        this.mp = maxMp;
        this.att = att;
        this.def = def;
        this.level = 1;
        this.exp = this.maxExp;
        this.maxExp = 100;
        this.items = new Item[10];

    }

    // 상태를 보여주는 메서드
    void showInfo() {
        System.out.println("=================================");
        System.out.println("--------------상태--------------");
        System.out.println("\t이름 : " + name);
        System.out.println("\t레벨 : " + level + "(" + exp + " / " + maxExp + ")"); // 경험치 최대치도 추가하기
        System.out.println("\t체력 : " + hp + " / " + maxHp);
        System.out.println("\t마나 : " + mp + " / " + maxMp);
        System.out.println("--------------아이템--------------");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            }
        }
        System.out.println("=================================");

    }

    // 공격 메서드 - 파라미터로 공격 대상을 받아야 함
    void attack(Monster m) {
        int damage = att - m.def;
        damage = damage <= 0 ? 1 : rand.nextInt(damage); // 조건 연산자(?:) true면 연산식 1 값 false면 연산식2 중 실행
        // damage = rand.nextInt(damage);
        m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
        System.out.println("\t" + name + "이 공격적으로 " + m.name + "에게 "
                + damage + "만큼 데미지를 주었습니다.");
        System.out.println("\t" + m.name + "의 현재 HP : " + m.hp + "\n");

    }

    // 경험치를 얻는 메서드
    void getExp(int exp) {
        System.out.println("\t" + exp + "의 경험치를 획득하였습니다.\n");
        this.exp += exp;
        while (maxExp <= this.exp) {
            levelUp();
            this.exp -= maxExp;

        }

    }

    // 레벨업 메서드 , 능력치 증가
    void levelUp() {
        level++;
        maxHp += 10;
        maxMp += 5;
        att += 2;
        def += 2;
        hp = maxHp;
        mp = maxMp;
        maxExp *= 1.2;
        exp = maxExp;
        System.out.println("\tLEVEL UP!!!");
    }

    void getItem(Item item) {
        System.out.println("\t" + item.name + "을 획득하였습니다.\n");
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
        maxHp += item.hp;
        maxMp += item.mp;
        att += item.att;
        def += item.def;
    }

}