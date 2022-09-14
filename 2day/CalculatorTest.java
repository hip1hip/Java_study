import javax.swing.JFrame;

import oracle.jrockit.jfr.JFR;

public class CalculatorTest extends JFrame {
    CalculatorTest() {
        setTitle("계산기");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorTest();
    }

}
