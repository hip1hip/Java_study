import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

import java.awt.BorderLayout;
import java.awt.Color;

public class MouseDragDemo extends JFrame {
    private int x1, y1, x2, y2;
    private JLabel statusBar;
    Color color = Color.BLACK;

    public MouseDragDemo() {
        setTitle("개발자 홍인표 마우스 사각형");
        DrawingArea DrawingArea = new DrawingArea();

        MyMouseListener listener = new MyMouseListener();
        DrawingArea.addMouseListener(listener);
        DrawingArea.addMouseListener(listener);

        add("South", new ButtonPanel(DrawingArea));
        add("Center", DrawingArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    private class MyMouseListener implements MouseListener, MouseMotionListener {
        @Override
        public void mousePressed(MouseEvent evt) {
            x1 = evt.getX();
            y1 = evt.getY();

        }

        @Override
        public void mouseDragged(MouseEvent evt) {
            x2 = evt.getX();
            y2 = evt.getY();
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent evt) {
            x2 = evt.getX();
            y2 = evt.getY();
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    class DrawingArea extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(color);
            int x = (x1 < x2) ? x1 : x2;
            int y = (y1 < y2) ? y1 : y2;
            int width = Math.abs(x1 - x2);
            int height = Math.abs(y1 - y2);
            g.drawRect(x, y, width, height);

        }
    }

    class ButtonPanel extends JPanel implements ActionListener {
        private DrawingArea drawingArea;

        public ButtonPanel(DrawingArea drawingArea) {
            this.drawingArea = drawingArea;

            add(crateButton("       ", Color.BLACK));
            add(crateButton("       ", Color.RED));
            add(crateButton("       ", Color.GREEN));
            add(crateButton("       ", Color.BLUE));
            add(crateButton("       ", Color.YELLOW));

        }

        private JButton crateButton(String text, Color background) {
            JButton button = new JButton(text);
            button.setBackground(background);
            button.addActionListener(this);

            return button;
        }

        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            color = button.getBackground();
        }

    }

    public static void main(String[] args) {
        new MouseDragDemo();
    }

}
