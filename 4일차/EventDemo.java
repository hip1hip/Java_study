import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class EventDemo extends JFrame {
    JTextField t1, t2;
    JTextArea area;
    JButton cal, reset;
    JComboBox cb;

    EventDemo() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 205);
        setVisible(true);

    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);

        // 667p 키 이벤트 추가
        KeyListener listener2 = new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar() + "를 입력했습니다.");
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        };
        t1.addKeyListener(listener2);
    }

    void showCenter() {
        JPanel panel = new JPanel();

        area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를 /n계산하는 과정이 나타납니다.");
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);

        add(panel, BorderLayout.CENTER);

    }

    void showSouth() {
        String[] color = { "red", "blue" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        cal = new JButton("계산");
        cb = new JComboBox<>(color);
        reset = new JButton("리셋");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);

        // 666p 콤보박스 엑션이벤트 , 아이템이벤트
        cb.addItemListener(e -> {
            int index = ((JComboBox) cb).getSelectedIndex();
            if (index == 0)
                area.setForeground(Color.RED);
            else
                area.setForeground(Color.BLUE);
        });

        // 665p 추가 - 반지름 값 대입 결과 확인.
        ActionListener listener1 = e -> {
            if (e.getSource() == cal) {
                if (t1.getText().isEmpty())
                    area.setText("반지름을 입력하세요!!!");
                else {
                    String s = t1.getText();
                    double radius = Double.parseDouble(s);
                    double result = radius * radius * 3.14;
                    t2.setText("" + result);
                    area.setText(radius + " * " + radius + " * 3.14 = " + result);
                }
            } else {
                t1.setText("");
                t2.setText("");
                area.setText("");
            }

        };
        cal.addActionListener(listener1);
        reset.addActionListener(listener1);

        // p668 마우스 이벤트
        addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("마우스 클릭");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("마우스 누르기");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("마우스 놓기");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("마우스 들어오기");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("마우스 나가기");
            }

        });

        addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                System.out.println("마우스드래그(" + e.getX() + ", " + e.getY() + ").");
            }

            public void mouseMoved(MouseEvent e) {
                System.out.println("마우스이동(" + e.getX() + ", " + e.getY() + ").");
            }

        });

    }

    public static void main(String[] args) {
        new EventDemo();
    }

}