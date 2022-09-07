import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClipDragTest02 extends JFrame {
    public ClipDragTest02() {
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
                img = ImageIO.read(new File("images/wato9.png"));
            } catch (IOException e) {
            }
            addMouseMotionListener(new MyMouseListener());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setClip(x, y, 200, 200);
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
        new ClipDragTest02();
    }
}