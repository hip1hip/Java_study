import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;

public class EtcDemo {
    public static void main(String[] args) {
        List<String> list1 = List.of("사업자", "홍인표", "십년후", "사업소득", "연매출", "십억");

        HashSet<String> set = new HashSet<>(list1);

        List<String> list2 = new ArrayList<>(set);
        Collections.sort(list2);

        for (String fruit : list2) {
            System.out.printf("%s : %d\n", fruit, Collections.frequency(list1, fruit));
        }

    }
}
