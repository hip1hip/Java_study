import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame {
    GridLayoutDemo() {
        setTitle("그리드 레이아웃!");
        setLayout(new GridLayout(0, 6));

        add(new JButton("버튼 1"));
        add(new JButton("버튼 2"));
        add(new JButton("버튼 3"));
        add(new JButton("버튼 4"));
        add(new JButton("버튼 5"));
        add(new JButton("버튼 6"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 80);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }

}
