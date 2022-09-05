import java.awt.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.ImageIcon;

public class Question04 extends JFrame {
    public Question04() {

        String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        setTitle("난수 알파벳");
        setLayout(null);

        for (int i = 0; i < 10; i++) {
            JLabel label = new JLabel(alpha[i]);
            int x = 30 + (int) (Math.random() * 220);
            int y = 30 + (int) (Math.random() * 100);
            label.setLocation(x, y);
            label.setSize(20, 20);
            add(label);
        }
        ImageIcon icon = new ImageIcon(this.getClass().getResource("images/dojang03.png"));
        JLabel label = new JLabel(icon, JLabel.CENTER);
        add(label, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Question04();

    }

}