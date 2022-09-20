
// p.159 도전과제 02번
// Coding by 홍인표/

class Printer {
    private int numOfPapers = 0;

    public Printer(int numOfPapers) {
        this.numOfPapers = numOfPapers;
    }

    public void print(int amount) {
        if (amount < numOfPapers) {
            System.out.println(amount + "장 출력했습니다." + "현재" + (numOfPapers - amount) + " 장 남아있습니다.");
        } else if (amount > numOfPapers) {
            System.out.println(
                    "모두 출력 하려면 용지가" + (amount - numOfPapers) + "매 부족합니다." + (-numOfPapers + amount) + "장만 출력합니다.");
        } else {
            System.out.println("용지가 없습니다.");
        }

    }

    public class Printer02Test {
        public static void main(String[] args) {
            Printer p = new Printer(10);
            p.print(2);
            p.print(20);
            p.print(10);

        }
    }
}