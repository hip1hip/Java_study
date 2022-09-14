import java.awt.*;
import javax.swing.*;
//import javax.swing.JOptionPane;

public class Question02 extends JFrame {
    Question02() {

        setTitle("섭씨 화씨");
        setLayout(new BorderLayout(10, 10));
        showNorth();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    void showNorth() {

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));
        JLabel l1 = new JLabel("섭씨");
        JLabel l2 = new JLabel("화씨");
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);

        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);
    }

    void showSouth() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("변환");

        panel.add(cal);
        add(panel, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new Question02();

    }
}