//p.651 문제05번 소스코드 참고 

//package chap15;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Question05 extends JFrame {
    public Question05() {
        JRadioButton[] pet = new JRadioButton[3];
        String[] name = { "강아지", "고양이", "금붕어" };

        setTitle("애완 동물");

        ButtonGroup bg = new ButtonGroup();
        JPanel panel1 = new JPanel();
        for (int i = 0; i < pet.length; i++) {
            pet[i] = new JRadioButton(name[i]);
            bg.add(pet[i]);
            panel1.add(pet[i]);
        }

        pet[0].setSelected(true);
        add(panel1, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question05();
    }
}