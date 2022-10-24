
public class Monster {
    String name; // 이름
    int hp; // 체력
    int att; // 공격력
    int def; // 방어력
    Item[] items;

    Monster(String name, int hp, int att, int def) {
        this.name = name;
        this.att = att;
        this.def = def;
        this.hp = hp;
    }

    void attack(Character c) {

        int damage = att - c.def;
        damage = damage <= 0 ? 1 : damage;
        c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
        System.out.println(name + "가 " + c.name + "에게 "
                + damage + "만큼 데미지를 주었습니다.");
        System.out.println(c.name + "의 현재 HP : " + c.hp);

    }

    Item itemDrop() {
        return items[(int) (Math.random() * items.length)];
    }

}
