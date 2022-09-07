import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PieDemo extends JFrame {
    int i = 0;

    PieDemo() {
        setTitle("개발자 홍인표 돌리기");

        JButton button = new JButton("쿨럭");
        JPanel Panel = new JPanel();
        Panel.add(button);
        button.addActionListener(e -> {
            i = ++i % 8;
            System.out.println(i);
            repaint();

        });

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK, Color.BLACK,
                        Color.YELLOW };

                g.setColor(c[i]);
                g.fillArc(40, 30, 150, 150, i * 45, 45);

            }
        }
        add(Panel, BorderLayout.NORTH);
        add(new MyPanel(), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PieDemo();
    }
}
