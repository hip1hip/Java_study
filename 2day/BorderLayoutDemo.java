import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo() {
        setTitle("보더 레이아웃!");
        setLayout(new BorderLayout());

        add("East", new JButton("동 백호"));
        add("West", new JButton("서 청룡"));
        add("South", new JButton("남 주작"));

        add(new JButton("북 현무"), BorderLayout.NORTH);
        add(new JButton("홍인표"), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }

}
