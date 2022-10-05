
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03_IteratorUse {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("김승모대리");
        list.add("김용선대리");
        list.add("김우송대리");
        list.add("김호진대리");

        for (String s : list)
            System.out.print(s + '\t'); // 탭처리
        System.out.println();

        Iterator<String> itr = list.iterator();

        String str;
        while (itr.hasNext()) {
            str = itr.next();
            System.out.print(str + '\t');

            if (str.equals("김승모 대리"))
                itr.remove();
        }
        System.out.println();

        itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + '\t');

            System.out.println();

        }

    }
}