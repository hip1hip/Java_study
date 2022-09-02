import javax.swing.*;

public class NoLayout extends JFrame {
    NoLayout() {
        setTitle("절대좌표");

        JPanel p = new JPanel();
        p.setLayout(null);

        JButton b1 = new JButton("B 1");
        b1.setBounds(10, 10, 60, 30);
        JButton b2 = new JButton("버튼 2");
        b2.setBounds(80, 20, 80, 25);
        JButton b3 = new JButton("Button 3");
        b3.setBounds(150, 40, 100, 30);
        JButton b4 = new JButton("But 4");
        b4.setBounds(180, 60, 120, 35);
        JButton b5 = new JButton(" B 5 ");
        b5.setBounds(200, 80, 110, 40);
        JButton b6 = new JButton("버튼 6");
        b6.setBounds(220, 120, 150, 50);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NoLayout();
    }

}