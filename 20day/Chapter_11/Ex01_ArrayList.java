import java.util.ArrayList;
import java.util.List;

/**
 * Ex01_ArrayList
 */
public class Ex01_ArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

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