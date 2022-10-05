import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
    public static void main(String[] args) {
        String[] s = { "사업자", "홍인표", "십년후", "사업소득", "연매출", "십억" };

        List<String> list = Arrays.asList(s);

        Collections.sort(list);
        System.out.println(list);
        int i = Collections.binarySearch(list, "둘");
        System.out.println(i);

    }
}
