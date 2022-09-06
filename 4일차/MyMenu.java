import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyMenu extends JFrame implements ActionListener {
    MyMenu() {
        setTitle("메뉴 구성하기");
        makeMenu();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 170);
        setVisible(true);
    }

    void makeMenu() {
        JMenuItem item;
        KeyStroke key;

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("파일");
        m1.setMnemonic(KeyEvent.VK_F);
        JMenu m2 = new JMenu("색상");
        m2.setMnemonic(KeyEvent.VK_C);
        JMenu m3 = new JMenu("MY");
        m3.setMnemonic(KeyEvent.VK_M);

        item = new JMenuItem("새 파일", KeyEvent.VK_N);
        item.addActionListener(this);
        m1.add(item);
        m1.add(new JMenuItem("파일저장"));
        m1.addSeparator();
        m1.add(new JMenuItem("종료"));

        item = new JMenuItem("파란색");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);

        item = new JMenuItem("빨간색");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);

        item = new JMenuItem("노란색");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);

        item = new JMenuItem("H", KeyEvent.VK_H);
        item.addActionListener(this);
        m3.add(item);

        m3.add(new JMenuItem("I"));
        m3.addSeparator();
        m3.add(new JMenuItem("N"));

        m2.add(item);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        setJMenuBar(mb);

    }

    public static void main(String[] args) {
        new MyMenu();

    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem mi = (JMenuItem) (e.getSource());

        switch (mi.getText()) {
            // case "새 파일" -> System.out.println("새 파일");
            // case "파일 열기" -> System.out.println("파일 열기");
            // case "파란색" -> getContentPane().setBackground(Color.BLUE);
            // case "빨간색" -> getContentPane().setBackground(Color.RED);
            // case "노란색" -> getContentPane().setBackground(Color.YELLOW);
            // 자바 14버전 사용 가능으로 오류
            case "새 파일":
                System.out.println("새 파일");
                break;
            case "파일 열기":
                System.out.println("파일 열기");
                break;
            case "파란색":
                getContentPane().setBackground(Color.BLUE);
                break;
            case "빨간색":
                getContentPane().setBackground(Color.RED);
                break;
            case "노란색":
                getContentPane().setBackground(Color.YELLOW);

                break;

            case "H":
                System.out.println("H");
                break;
            case "I":
                System.out.println("I");
                break;

        }

    }
}
