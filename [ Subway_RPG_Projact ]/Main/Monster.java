public class Monster {

    static String name; // 이름
    int maxHp; // 최대체력
    int maxMp; // 최대마나
    int hp; // 체력
    static int att; // 공격력
    int def; // 방어력

    Monster(String name, int maxHp, int hp, int att, int def) {
        this.name = name;
        this.maxHp = hp;
        this.hp = this.maxHp;
        this.att = att;
        this.def = def;
    }

    public static void Elite(Character c) {
        int damage = att - c.def;
        damage = damage <= 0 ? 1 : damage;
        c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
        System.out.println(name + "가 공격적으로" + c.name + "에게"
                + damage + "만큼 데미지를 주었습니다.");
        System.out.println(c.name + "의 현재 HP :" + c.hp);
    }

    public static void monster(Character c) {
        int damage = att - c.def;
        damage = damage <= 0 ? 1 : damage;
        c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
        System.out.println(name + "가 공격적으로" + c.name + "에게"
                + damage + "만큼 데미지를 주었습니다.");
        System.out.println(c.name + "의 현재 HP :" + c.hp);
    };
}
