import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        String[] fruits = { "포도", "수박", "사과", " 키위", "망고" };
        List<String> list = Arrays.asList(fruits);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
