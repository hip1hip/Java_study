// p.158 도전과제 01번
// Coding by 홍인표/

class Printer {
    public static int amount;
    int numOfPapers = 0;

    public void print(int amount) {
        System.out.println(("남은 용지 : ") + (numOfPapers - amount));
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.numOfPapers = 100;
        p.amount = 70;
        p.print(amount);

    }
}