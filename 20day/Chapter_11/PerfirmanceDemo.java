import java.util.ArrayList;
import java.util.LinkedList;

public class PerfirmanceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++)
            al.add(0, i);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("ArrayList로 처리한 시간 : " + duration);

        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++)
            ll.addFirst(i);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList로 처리한 시간 : " + duration);

    }
}
