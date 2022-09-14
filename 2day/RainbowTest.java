//Your Rainbow... Extra Qustion- 수업시간이 조금 남으면 합니다...

import javax.swing.*;
import java.awt.*;

public class RainbowTest extends JFrame {
    public RainbowTest() {
        setTitle("Your Rainbow...");

        setLayout(new GridLayout(1, 7));

        Color indigo = new Color(0, 5, 255);
        Color purple = new Color(100, 0, 255);
        JButton[] btn = new JButton[7];
        Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.BLUE, indigo, purple };
        String[] s = { "빨", "주", "노", "초", "파", "남", "보" };

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(s[i]);
            btn[i].setOpaque(true);
            btn[i].setBackground(color[i]);
            add(btn[i]);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RainbowTest();
    }

}