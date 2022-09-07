
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Smile extends JFrame {
    public Smile() {
        setTitle("개발자 홍인표 스마일");
        add(new CustomPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Smile();
    }

    class CustomPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 노랑 얼굴
            g.setColor(Color.ORANGE);
            g.fillOval(10, 10, 200, 200);

            // outline
            g.setColor(Color.BLACK);
            g.drawOval(10, 10, 200, 200);

            // left eye white
            g.setColor(Color.WHITE);
            g.fillOval(35, 35, 30, 50);

            // left eye outline
            g.setColor(Color.BLACK);
            g.drawOval(35, 35, 30, 50);

            // left eye ball
            g.setColor(Color.BLACK);
            g.fillOval(40, 40, 15, 25);

            // right eye whitel
            g.setColor(Color.WHITE);
            g.fillOval(110, 35, 30, 50);

            // right eye outline
            g.setColor(Color.BLACK);
            g.drawOval(110, 35, 30, 50);

            // right eye ball
            g.setColor(Color.BLACK);
            g.fillOval(115, 40, 15, 25);

            // nose
            g.setColor(Color.ORANGE.brighter());
            g.fillOval(66, 76, 30, 25);

            // nose out
            g.setColor(Color.BLACK);
            g.drawOval(66, 76, 30, 25);

            // 입
            g.setColor(Color.RED);
            g.fillArc(30, 110, 100, 30, 0, -180);
            // 입 오랜지 입혀서 스마일 만 만들기
            g.setColor(Color.ORANGE);
            g.fillArc(30, 110, 100, 28, 0, -180);

        }
    }

}