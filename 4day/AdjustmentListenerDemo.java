import java.awt.*;
import javax.swing.*;

import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class AdjustmentListenerDemo extends JFrame {
    AdjustmentListenerDemo() {
        setTitle("스크롤바 손잡이 움직이기");

        JLabel label = new JLabel("", JLabel.CENTER);

        JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
        bar.setValues(100, 20, 0, 200);
        bar.addAdjustmentListener(e -> {
            int v = e.getValue();
            label.setText("위치 : " + v);
        });

        add("Center", label);
        add("North", bar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdjustmentListenerDemo();

    }
}
