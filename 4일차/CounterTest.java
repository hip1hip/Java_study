import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterTest extends JFrame {
    private int count = 0;
    private JLabel label;
    private JButton b1;

    CounterTest() {
        setTitle("카운터");

        JPanel p1 = new JPanel();
        label = new JLabel("갯수 = 0");
        // 개수 0부터 시작
        p1.add(label);
        add("Center", p1);
        // Center 대소문자 구별 필수!

        JPanel p2 = new JPanel();
        b1 = new JButton("증가");
        b1.addActionListener(e -> {
            count++;
            // 1씩증가
            label.setText("개수 = " + count);
        });
        p2.add(b1);
        add("South", p2);
        // South 로 위아래 방향 결정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CounterTest();
    }

}
