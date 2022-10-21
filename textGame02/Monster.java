public class Monster {

    String name; // 이름
    int maxHp; // 최대체력
    int maxMp; // 최대마나
    int hp; // 체력
    int mp; // 마나
    int att; // 공격력
    int def; // 방어력
    Item[] items; // 보유아이템을 저장할 배열

    Monster(String name, int maxHp, int matMp, int hp, int mp, int att, int def, Item[] items) {
        this.name = name;
        this.maxHp = hp;
        this.maxMp = mp;
        this.hp = this.maxHp;
        this.mp = this.maxMp;
        this.att = att;
        this.def = def;
        this.items = items;
    }

    void attack(Character c) {
        int damage = att - c.def;
        damage = damage <= 0 ? 1 : damage;
        c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
        System.out.println(name + "가 공격적으로" + c.name + "에게"
                + damage + "만큼 데미지를 주었습니다.");
        System.out.println(c.name + "의 현재 HP :" + c.hp);
    }

    Item itemDrop() {
        return items[(int) (Math.random() * items.length)]; // 보유한 아이템에 랜덤인덱스 생성해서 리턴

    }

}