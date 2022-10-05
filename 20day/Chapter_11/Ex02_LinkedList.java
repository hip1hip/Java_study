
import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("김승모대리");
        list.add("김용선대리");
        list.add("김우송대리");
        list.add("김호진대리");

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t'); // 탭처리
        System.out.println();

        list.remove(0);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();

    }
}