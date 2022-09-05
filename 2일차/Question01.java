//p.650 문제01번 소스코드

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import javax.swing.JLabel;

public class Question01 {

    public static void main(String[] args) {

        String s1, s2;
        int sum;

        s1 = JOptionPane.showInputDialog("첫 번째 숫자는?");
        s2 = JOptionPane.showInputDialog("두 번째 숫자는?");

        sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        JOptionPane.showMessageDialog(null, "합 = " + sum);

    }

}
