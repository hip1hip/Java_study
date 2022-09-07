
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class RainbowOne extends JFrame {
    RainbowOne() {
        setTitle("개발자 홍인표 무지개 원");

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK, Color.WHITE,
                        new Color(0x000080),
                        new Color(0x808080), new Color(0x000010), new Color(0x202020), new Color(0x100050),
                        new Color(0x105000), Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK,
                        Color.WHITE };
                for (int i = 0; i < 20; i++) {
                    int d = delta(i);
                    g.setColor(c[i]);
                    g.drawOval(10 + d, 10 + d, 700 - d * 2, 700 - d * 2);
                }

            }

        }
        add(new MyPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);

    }

    int delta(int x) {
        double diagonal = Math.sqrt(240 * 240);
        return (int) (diagonal * 15 * x / 240);
    }

    public static void main(String[] args) {
        new RainbowOne();
    }

}
