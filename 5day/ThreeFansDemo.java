
import java.awt.Graphics;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreeFansDemo extends JFrame {
    public ThreeFansDemo() {
        setTitle("개발자 홍인표 3개 팬스");

        add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int cx = getWidth() / 2;
                int cy = getHeight() / 2;
                int radius = (int) (Math.min(getWidth(), getHeight()) * 0.3);
                int x = cx - radius;
                int y = cy - radius;

                g.setColor(Color.RED);
                g.fillArc(x, y, radius * 2, radius * 2, 0, 45);
                g.setColor(Color.BLACK);
                g.fillArc(x, y, radius * 2, radius * 2, 90, 45);
                g.setColor(Color.ORANGE);
                g.fillArc(x, y, radius * 2, radius * 2, 180, 45);
                g.setColor(Color.WHITE);
                g.fillArc(x, y, radius * 2, radius * 2, 270, 45);

            }

        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ThreeFansDemo();
    }

}
