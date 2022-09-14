import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

//p727_문제9번 소스코드

public class ClipDragTest extends JFrame {
    public ClipDragTest() {
        setTitle("클리핑 영역 움직이기");

        MyPanel p = new MyPanel();
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);

    }

    class MyPanel extends JPanel {
        int x, y;
        BufferedImage img;

        public MyPanel() {
            try {
                img = ImageIO.read(new File("wato10.jpg"));
            } catch (IOException e) {

            }
            addMouseMotionListener(new MyMouseListener());

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setClip(x, y, 100, 100);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        }

        class MyMouseListener implements MouseMotionListener {
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

            public void mouseMoved(MouseEvent e) {

            }
        }

    }

    public static void main(String[] args) {
        new ClipDragTest();

    }
}
