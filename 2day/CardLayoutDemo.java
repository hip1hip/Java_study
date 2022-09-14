import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame {
    CardLayout layout;

    public void rotate() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
            layout.next(this.getContentPane());
        }
    }

    CardLayoutDemo() {
        setTitle("카드레이아웃!");
        layout = new CardLayout();
        setLayout(layout);
        add(new JButton("버튼 1"));
        add(new JButton("버튼 2"));
        add(new JButton("버튼 3"));
        add(new JButton("버튼 4"));
        add(new JButton("버튼 5"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo().rotate();
    }

}
