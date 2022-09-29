
public class MathScore implements Comparable<MathScore> {
    String name;
    int score;

    public MathScore(String name, int rank) {
        this.name = name;
        this.score = rank;
    }

    @Override
    public int compareTo(MathScore m) {
        // 2개의 MathScore 객체를 비교하는 코드
        if (this.score > m.score)
            return 1;
        else if (this.score == m.score)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return name + " , " + score;
    }

}
