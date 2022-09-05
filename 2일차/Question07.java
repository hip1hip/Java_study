import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Question07 extends JFrame {
    public Question07() {

        setTitle("카드 레이아웃");

        JPanel panel = new JPanel(new GridLayout(0, 4, 10, 0));

        JButton cal1 = new JButton("<<");
        JButton cal2 = new JButton("<");
        JButton cal3 = new JButton(">");
        JButton cal4 = new JButton(">>");

        panel.add(cal1);
        panel.add(cal2);
        panel.add(cal3);
        panel.add(cal4);
        add(panel, "North");

        JPanel p2 = new JPanel(new CardLayout());
        for (int i = 1; i <= 5; i++) {
            p2.add(new JButton("카드 번호 " + i + "!"));
        }
        add("Center", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Question07();

    }
}