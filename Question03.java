import java.awt.*;
import javax.swing.*;

public class Question03 extends JFrame {
    Question03() {

        setTitle("색상 선택기");
        setLayout(new BorderLayout(10, 10));
        showCenter();
        showNorth();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    void showCenter() {
        String[] color = { "빨강", "파랑", "노랑" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JComboBox<String> cb = new JComboBox<>(color);

        panel.add(cb);

        add(panel, BorderLayout.NORTH);

    }

    void showSouth() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JCheckBox b = new JCheckBox("배경색");
        JCheckBox f = new JCheckBox("전경색");

        panel.add(b);
        panel.add(f);

        add(panel, BorderLayout.CENTER);
    }

    void showNorth() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal1 = new JButton("예");
        JButton cal2 = new JButton("아니오");

        panel.add(cal1);
        panel.add(cal2);
        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Question03();

    }
}