import java.util.List;
import java.util.stream.Stream;

//516p 개발자 홍인표 

public class MemberDemo {
    public static void main(String[] args) {
        Stream<String> ss;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

        ss = names.stream();
        ss.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));

        System.out.println();
        ss = names.stream();
        ss.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = names.stream();
        System.out.println(ss.findFirst());
        ss = names.stream();
        System.out.println(ss.findFirst().get());
        ss = names.stream();
        System.out.println(ss.count());

    }
}
