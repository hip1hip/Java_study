import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Convert {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김승모대리", "김용선대리", "김우송대리", "김호진대리");
        //list.add("송원석 대리");
        list = new ArrayList<>(list);
        list.add("오세빈대리");

        for (Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + '\t');
        System.out.println();

        list = new LinkedList<>(list);

        for (String s : list)
            System.out.print(s + '\t');
        System.out.println();

    }
}
