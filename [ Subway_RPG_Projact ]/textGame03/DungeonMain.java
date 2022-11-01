import java.util.Random;
import java.util.Scanner;

// 22.10.20 Coding by 홍인표 

public class DungeonMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // enemies variables
        String[] enemies = { "스켈레톤", "좀비", " 바바리안", "도적", "박쥐", "거미" };
        int maxEnemyHealth = 90; // 적의 최대 체력
        int enemyAttackDamage = 30; // 적의 데미지

        // Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3; // 시작 포션 갯수
        int healthPotionHealAmount = 30; // 물약 사용
        int healthPotionDropChance = 50; // 적처치, 물약 50%로 드랍
        int exp = 80;
        int level = 1;

        // 턴
        int turn = 1;

        boolean running = true;
        System.out.println("------------------------------------------------------------");
        System.out.println("Welcome to the Dungeon!");

        GAME: while (true) {
            System.out.println("------------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth); // 적체력을 0에서~ 75까지 설정
            String enemy = enemies[rand.nextInt(enemies.length)]; // 랜덤 적 생성
            System.out.println("\t# " + enemy + " 나타났습니다! #\n");

            while (enemyHealth > 0) { // 임의의 적 체력이 0될때까지
                System.out.println("\t Your Hp : " + health);
                System.out.println("\t " + enemy + " HP: " + enemyHealth);
                System.out.println("\n\t 어떤 행동을 취할까요?  ");
                System.out.println("\t 1. 공격");
                System.out.println("\t 2. 포션 마시기");
                System.out.println("\t 3. 도망치기!");

                String input = in.nextLine();
                if (input.equals("1")) { // input = 1 이면~ // equals는 문자열 비교 메서드
                    int damageDealt = rand.nextInt(attackDamage); // 공격하여 입히는 피해 랜덤 0 ~ attackDamage(50)
                    int damageTaken = rand.nextInt(enemyAttackDamage); // 받는 피해 0 ~ enemyAttackDamage(30)

                    enemyHealth -= damageDealt; // 적체력 마이너스
                    health -= damageTaken; // 내체력 마이너스

                    // 공격 몇 턴 째인지
                    System.out.println("\t> " + turn + "번째 공격");
                    turn++;
                    System.out.println("\t> 당신은 공격하여 " + enemy + " 에게 " + damageDealt + "데미지를 입혔습니다!");
                    System.out.println("\t> 적이 공격하여 " + damageTaken + "피해를 입었습니다! ");

                    if (health < 1) {
                        System.out.println("\t> 너무 큰 데미지를 입었습니다!");
                        break; // 체력없음, while 벗어남
                    }

                } else if (input.equals("2")) {
                    if (numHealthPotions > 0) { // 포션이 가방에 하나 넘게 있으면 실행
                        health += healthPotionHealAmount;
                        numHealthPotions--; // 포션을 사용하여 인벤토리에서 하나 제거
                        System.out.println("\t 포션을 사용하여 " + healthPotionHealAmount + "회복하였습니다."
                                + "\n\t> 당신의 남은체력은  " + health + "HP."
                                + "\n\t> 당신은 남은 포션은 " + numHealthPotions + "개 남았습니다. \n");

                    } else {
                        System.out.println("\t> 당신의 남은 포션은 없습니다. 적을 처치하면 확률적으로 포션을 드롭합니다.");
                    }

                } else if (input.equals("3")) {
                    System.out.println("\t" + enemy + "로 부터 도망칩니다! ");
                    continue GAME; // 아래는 무시 위로 올라감

                } else {
                    System.out.println("\t 입력이 잘 못 되었습니다."); // 유효성 검사
                    System.out.println("------------------------------------------------------------");
                }
            } // while (enemyHealth > 0)

            if (health < 1) {
                System.out.println("\t> 체력이 없음으로 던전 밖으로 나가여 회복합니다. ");
                break;
            }

            System.out.println("------------------------------------------------------------");
            System.out.println("\n # " + enemy + " 를 물리쳤다! #");
            System.out.println(" # 당신의 체력은 " + health + " HP 남았습니다 #");

            int enemyExp = rand.nextInt(exp);
            exp += enemyExp;

            int expbar = 100;
            if (enemyExp >= expbar) {
                level++;
                enemyExp -= expbar;
                health += 30;
                expbar += 20;
                System.out.println("\n\t !!!레벨업!!! ");
                System.out.println("\n # 체력이 상승합니다.");
            }
            System.out.println(" # 현제 레벨 : " + level + "\t 남은 경험치 : " + enemyExp + ("/") + expbar + " # ");

            System.out.println(" ");
            if (rand.nextInt(100) < healthPotionDropChance) { // 0~ 100 랜덤 확률로 포션 드롭 명령
                numHealthPotions++;
                System.out.println(" # " + enemy + "가 포션을 드롭했습니다! # ");
                System.out.println(" # 포션 " + numHealthPotions + "개를 가지고 있습니다. # ");
            }
            System.out.println("------------------------------------------------------------");
            System.out.println("이제 무엇을 할 건가요?");
            System.out.println("1. 계속 전진하기 ");
            System.out.println("2. 던전 탈출하기 "); // 적을 물릴칠 때 마다 표시됨

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("입력이 잘 못 되었습니다. "); // 유효성 검사
                input = in.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("계속 전진합니다!! ");
            } else if (input.equals("2")) {
                System.out.println("던전을 탈출합니다. 모험을 종료합니다. ");
                break;
            }

        } // GAME: while (true)

        System.out.println("\n######################################");
        System.out.println("# 게임을 플레이 해주셔서 감사합니다! #");
        System.out.println("######################################");

    } // main
}