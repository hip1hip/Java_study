public class ScoreTest {

    static <T extends Comparable> T findBest(T[] a) {
        T best = a[0];

        for (int i = 0; i < a.length; i++)
            if (best.compareTo(a[i]) < 0)
                best = a[i];
        return best;
    }

    static <T> T findScore(T[] a, String name) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].toString().substring(0, 3).equals(name))
                return a[i];
        }
        return null;
    }

    public static void main(String[] args) {
        EnglishScore[] ea = { new EnglishScore("김삿갓", 77),
                new EnglishScore("장영실", 88),
                new EnglishScore("홍길동", 99)
        };
        MathScore[] ma = { new MathScore("김삿갓", 80),
                new MathScore("장영실", 98),
                new MathScore("홍길동", 70) };

        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));

        String name = null;
        try {
            name = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("명령행 인자가 없습니다.");
            return;
        }
        System.out.println("영어  점수 : " + findScore(ea, name));
        System.out.println("수학  점수 : " + findScore(ma, name));
    }

}