// Class 명 : Calculator

//p.646 관련 추가 소스코드_Calculator
// 아래 소스코드의 변경할 수 있는 부분과 변경이 되지 않는 부분을 찾아 수정합니다...
//package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Eclipse에서는 소스만 입력하고  CTRL+ALT+o(알파벳)를 입력한다. 

public class Calculator_InPyo extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField display;
    private JButton[] buttons;
    private String[] labels = { "Backspace", "", "", "CE", "C", "7", "8", "9",
            "😁", "sqrt", "4", "5", "6", "😃", "😀", "1", "2", "3", "-", "1/x",
            "0", "-/+", ".", "😄", "=", "10", "11", "12", "", "" };

    private double result = 0;
    private String operator = "=";
    private boolean startOfNumber = true;

    public Calculator_InPyo() {
        display = new JTextField(45);
        panel = new JPanel();
        display.setText("0");
        // 0.0 개조해보기
        display.setEnabled(true);
        // 주석 해제해보기

        panel.setLayout(new GridLayout(6, 5, 4, 4));
        buttons = new JButton[30];
        int index = 0;
        for (int rows = 0; rows < 5; rows++) {
            for (int cols = 0; cols < 5; cols++) {
                buttons[index] = new JButton(labels[index]);
                if (cols >= 3)
                    buttons[index].setForeground(Color.red);
                else
                    buttons[index].setForeground(Color.blue);
                buttons[index].setBackground(Color.white);
                panel.add(buttons[index]);
                buttons[index].addActionListener(this);
                index++;
            }
        }
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent e) { // 아래 소스코드 분석 필요...
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {
            startOfNumber = true;
            result = 0;
            operator = "=";
            display.setText("0.0");
        } else if (command.charAt(0) >= '0' && command.charAt(0) <= '9'
                || command.equals(".")) {
            if (startOfNumber == true)
                display.setText(command);
            else
                display.setText(display.getText() + command);
            startOfNumber = false;
        } else {
            if (startOfNumber) {
                if (command.equals("-")) {
                    display.setText(command);
                    startOfNumber = false;
                } else
                    operator = command;
            } else {
                double x = Double.parseDouble(display.getText());
                calculate(x);
                operator = command;
                startOfNumber = true;
            }
        }
    }

    private void calculate(double n) { // 아래 가감승제 버튼 모양을 변경할 방법을 찾는다...
        if (operator.equals("+"))
            result += n;
        else if (operator.equals("-"))
            result -= n;
        else if (operator.equals("x"))
            result *= n;
        else if (operator.equals("/"))
            result /= n;
        else if (operator.equals("="))
            result = n;
        display.setText("" + result);
    }

    public static void main(String args[]) {
        Calculator_InPyo s = new Calculator_InPyo();
    }
}
// 소스코드 작성 종료...