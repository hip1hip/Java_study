import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGame {

    public static void audio() {
        try {
            File file = new File("introMusic.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            // clip.loop(3);
            clip.start();
        } catch (Exception e) {
            System.err.println(" ");
        }
    }

    private static String arg;

    Character c;
    Item[] items;

    MainGame() {
        c = new Character(100, 50, 30, 10);

        items = new Item[10];
        items[0] = new Item("대검", 0, 0, 10, 0);
        items[1] = new Item("갑옷", 10, 0, 0, 10);
        items[2] = new Item("가시갑옷", 20, 0, 0, 10);
        items[3] = new Item("롱소드", 0, 0, 20, 0);
        items[4] = new Item("창", 0, 0, 25, 0);
        items[5] = new Item("지팡이", 0, 10, 10, 0);
        items[6] = new Item("할버드", 0, 0, 30, 0);
        items[7] = new Item("방패", 0, 0, 0, 30);
        items[8] = new Item("투구", 20, 0, 0, 40);
        items[9] = new Item("책", 0, 50, 0, 0);

    }

    public static void main(String[] args) {

        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        ImageIcon icon = new ImageIcon(arg);
        f.setSize(480, 360);
        f.setVisible(true);
        l.setIcon(icon);
        p.add(l);
        f.getContentPane().add(p);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        audio();

        System.out.println(
                "\n나의 마지막 기억은 새벽에 잠든 기억이다.\n근데 밖이 어둡다. 새벽인지 밤인지 모르겠다. \n이게 현실인지, 꿈인지 구별이 안간다. \n어째서 서울역으로 가야만 이 곳을 빠져 나갈 수 있을 것 같은 느낌이다.\n여기는 문산역, 경의중앙선을 타고 서울역으로 가야한다.");

        System.out.println("\n------------------------------------------------------------");
        System.out.println("======================= Subway RPG =========================");

        new MainGame().start();

    }

    String[] subway = new String[] { "문산", "파주", "월롱", "금촌", "금릉", "운정", "야당", "탄현", "일산", "풍산", "백마",
            "곡산", "대곡", "능곡", "행신", "강매", "화전", "수색", "디엠씨", "가좌", "신촌", "서울" };

    void start() {
        int input = 0;
        MAIN: while (true) {
            System.out.println("------------------------------------------------------------");

            System.out.println("\t1. 내정보\t2. 출발 \t3. 탈출 ");
            input = ScanUtil.nextInt();
            switch (input) {
                case 1:
                    c.showInfo();
                    break;
                case 2:

                    for (int i = 1; i <= subway.length; i++) {
                        System.out.println("\t이번역은 " + subway[i] + "역 입니다. ");
                        if (i == 10) {
                            System.out.println("------------------------------------------------------------");

                            System.out.println("\t종착역입니다. 게임을 종료합니다.");
                            System.out.println("------------------------------------------------------------");
                            System.out.println("플레이를 봐주셔서 감사합니다.");
                            System.out.println("------------------------------------------------------------");

                            System.exit(0);
                        }
                        hunt();

                    }
                    break;

                case 3:
                    System.out.println("탈출하였습니다.");
                    System.exit(0);
                    break;
            }
        }
    }

    void hunt() {
        Random rand = new Random();
        String[] names = { "고블린", "오크", "괴물", "도적", "악마" };

        String name = names[rand.nextInt(names.length)];

        Monster m = new Monster(name, 50, 10, 20, 10, 5, 5, new Item[] { items[0],
                items[1], items[2], items[3], items[4], items[5], items[6], items[7], items[8], items[9] });

        System.out.println("\t" + m.names + "을 만났습니다. 전투를 시작합니다.");

        int input = 0;
        battle: while (true) {
            System.out.println("\t1. 공격 \t 2. 도망 \t 3. 내정보");
            input = ScanUtil.nextInt();

            switch (input) {
                case 1:
                    c.attack(m);
                    if (m.hp < 1) {
                        System.out.println("\t" + m.names + "을 처치하였습니다.");
                        c.getExp(100);
                        c.getItem(m.itemDrop());

                        break battle;
                    }
                    m.attack(c);
                    break;
                case 2:
                    System.out.println("\t도망쳤습니다, 다음 구역으로 이동합니다.");
                    System.out.println("------------------------------------------------------------");

                    break battle;

                case 3:
                    c.showInfo();
                    break;
            }

        }

    }

}
