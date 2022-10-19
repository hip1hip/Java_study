import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TrainGame extends JFrame {

    class MyThread extends Thread {
        private JLabel label;
        private int x, y;

        public MyThread(String fname, int x, int y) {
            this.x = x;
            this.y = y;
            label = new JLabel();
            label.setIcon(new ImageIcon(fname));
            label.setBounds(x, y, 100, 100);
            add(label);
        }

        public void run() {
            for (int i = 0; i < 200; i++) {
                x += 10 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public TrainGame() {
        setTitle("Trains");
        setSize(1000, 700);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        (new MyThread("D:\\tetris\\image\\train1.png", 100, 0)).start();
        (new MyThread("D:\\tetris\\image\\train2.png", 100, 100)).start();
        (new MyThread("D:\\tetris\\image\\train3.png", 100, 200)).start();
        (new MyThread("D:\\tetris\\image\\train4.png", 100, 300)).start();
        (new MyThread("D:\\tetris\\image\\train5.png", 100, 400)).start();
        setVisible(true);
    }

    public static void main(String[] args) {
        TrainGame t = new TrainGame();
    }
}
