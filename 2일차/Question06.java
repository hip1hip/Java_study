import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Question06 extends JFrame {
    Question06() {
        setTitle("박스 레이아웃!");

        ImageIcon icon = new ImageIcon(this.getClass().getResource("images/dojang03.png"));
        JLabel label = new JLabel(icon, JLabel.CENTER);
        add(label);

        Container con = getContentPane();

        // 수평 정렬: BoxLayout.X_AXIS
        // 수직 정렬: BoxLayout.Y_AXIS
        con.setLayout(new BoxLayout(con, BoxLayout.X_AXIS));

        con.add(new JButton("버튼 1"));
        con.add(new JButton("버튼 2"));
        con.add(new JButton("버튼 3"));
        con.add(new JButton("버튼 4"));
        con.add(new JButton("버튼 5"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(550, 300);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question06();
    }

}
