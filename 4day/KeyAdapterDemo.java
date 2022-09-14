import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

//import javafx.scene.input.KeyEvent;

public class KeyAdapterDemo extends JFrame {

    public KeyAdapterDemo() {
        setTitle("키 어뎁터");
        JLabel l = new JLabel("", JLabel.CENTER);
        JTextField t = new JTextField(10);

        add("North", t);
        add("Center", l);

        t.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    l.setText("입력한 문자열 : " + t.getText());
                }
            }

        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new KeyAdapterDemo();

    }
}
