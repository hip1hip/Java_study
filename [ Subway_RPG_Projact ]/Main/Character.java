import java.util.Random;

public class Character {
    Random rand = new Random();
    String name; // 이름
    int maxHp; // 최대체력
    int hp; // 체력
    int att; // 공격력
    int def; // 방어력
    int level; // 레벨
    int exp; // 경험치
    int maxExp;
    // Item[] items; // 보유아이템을 저장할 배열

    Character(String name, int hp, int mp, int att, int def) { // 생성자 만들어서 변수 초기화
        this.name = name;
        this.maxHp = hp;
        this.hp = this.maxHp;
        this.att = att;
        this.def = def;
        this.level = 1;
        this.exp = this.maxExp;
        // this.items = new Item[10];
        this.maxExp = 100;

    }

    void showInfo() {

        System.out.println("================================");
        System.out.println("------------- 상태 ---------------");
        System.out.println("이름 : " + name);
        // System.out.println("레벨 : " + level + "(" + exp + "/100)");
        System.out.println("레벨 : " + level + " (" + exp + " / " + maxExp + ")"); // 경험치 최대치도 추가하기
        System.out.println("체력 : " + hp + "/" + maxHp);
        System.out.println("공격 : " + att);
        System.out.println("방어 : " + def);
        System.out.println("------------ 아이템 --------------");
        // for (int i = 0; i < items.length; i++) {
        // if (items[i] != null) {
        // System.out.println(items[i]);
        // }
        // }
        System.out.println("================================");
    }
}