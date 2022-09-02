import javax.swing.*;

public class Hong1Demo extends JFrame {
    Hong1Demo() {
        setTitle("hi,풀스윙!");

        JPanel bb = new JPanel();
        JLabel i = new JLabel("hello,스윙!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        JButton ppp = new JButton("클릭이이이이이이이이이ㅣ이이이이이이이이이이이이이ㅣ이이잉");
        bb.add(i);
        bb.add(ppp);
        add(bb);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(100, 120);
        // 사이즈가 작으면 그대로 출력
        pack();
        // 팩은 크기에 맞게 출력
        setVisible(true);
    }

    public static void main(String[] args) {
        new Hong1Demo();
    }
}
