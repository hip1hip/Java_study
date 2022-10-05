import java.util.Set;
import java.util.TreeSet;
import java.util.*;
import java.util.HashSet;

public class TreeSetDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
        HashSet<String> hashset = new HashSet<>(set);
        System.out.println(hashset);
        TreeSet<String> treeset = new TreeSet<>(set);
        System.out.println(treeset);

        System.out.println(treeset.first());
        System.out.println(treeset.last());
        System.out.println(treeset.lower("사과"));
        System.out.println(treeset.higher("사과"));

    }
}
