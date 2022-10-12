import java.util.Random;

class Accumulator extends Thread {
    int repeat;
    long sum = 0;

    public Accumulator(int no) {
        this.repeat = no;
    }

    @Override
    public void run() {
        long num;
        Random r = new Random();
        for (int i = 0; i < repeat; i++) {
            num = r.nextInt(10);
            System.out.println(getName() + " : " + num);
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            sum += num;
        }
    }

    public long getSum() {
        return sum;
    }
}

public class PlusSumTest {
    public static void main(String[] args) {
        Accumulator a1 = new Accumulator(3);
        Accumulator a2 = new Accumulator(2);

        a1.start();
        a2.start();

        try {
            a1.join();
            a2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("누적값 : " + (a1.getSum() + a2.getSum()));
    }
}
