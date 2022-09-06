// p.682 도전과제 02

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterTest02 extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JButton b1;

    CounterTest02() {
        setTitle("카운터");
        JPanel p1 = new JPanel();
        label = new JLabel("개수 = 0");
        p1.add(label);
        add("Center", p1);

        JPanel p2 = new JPanel();
        b1 = new JButton("시작");
        b1.addActionListener(this);
        p2.add(b1);
        add("South", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Thread(() -> {
            while (true) {
                count++;
                label.setText("카운트  = " + count);
                try {
                    Thread.sleep(500);
                    // 0.5초 증가
                } catch (Exception ex) {

                }
            }
        }).start();

    }

    public static void main(String[] args) {
        new CounterTest02();
    }
}