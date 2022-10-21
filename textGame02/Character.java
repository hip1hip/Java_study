public class Character {

	String name;	//이름
	int maxHp;		//최대체력
	int maxMp;		//최대마나
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int level;		//레벨
	int exp;		//경험치
	Item[] items;	//보유아이템을 저장할 배열
	
	Character(String name, int hp, int mp, int att, int def){ //생성자 만들어서 변수 초기화
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	
	}
	//상태를 보여주는 메서드
	void showInfo(){
		System.out.println("================================");
		System.out.println("------------- 상태 ---------------");
		System.out.println("이름 : "+ name);
		System.out.println("레벨 : "+ level + "("+ exp + "/100)");
		System.out.println("체력 : "+ hp + "/" + maxHp);
		System.out.println("마나 : "+ mp + "/" + maxMp);
		System.out.println("공격 : "+ att);
		System.out.println("방어 : "+ def);
		System.out.println("------------ 아이템 --------------");
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(items[i]);
			}
		}
		System.out.println("================================");
	}
	
	//공격메서드 -파라미터로 공격 대상을 받아야 함
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "이 공격적으로 " + m.name + "에게 "
							+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 현재 HP : "+ m.hp);
	}
	//경험치를 얻는 메서드
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100<=this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	//일정 경험치를 얻으면 레벨업, 능력치 증가?/ 아이템을 얻는 메서드
	void levelUp(){
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("LEVEL UP!!");
	}
	//아이템 가지고 있으면 능력치 증가?
	void getItem(Item item){
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i < items.length; i++){
			if(items[i]==null){
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