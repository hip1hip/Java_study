
public class EnglishScore implements Comparable<EnglishScore> {
    String name;
    int score;

    public EnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(EnglishScore e) {
        // 2개의 EnglishScore 객체를 비교하는 코드
        if (this.score > e.score)
            return 1;
        else if (this.score == e.score)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return name + " , " + score;
    }

}
