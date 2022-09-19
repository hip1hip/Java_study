//158p 개발자 홍인표

// 02번 
// class Printer {
//     private int numOfPapers = 0;

//     public Printer(int numOfPapers) {
//         this.numOfPapers = numOfPapers;

//     }

//     // numOfPapers = 현재 용지수
//     public void print(int amount) {
//         if (numOfPapers == 0) {
//             System.out.println("용지가 없습니다. ");
//         } else if (numOfPapers < amount) {
//             System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. ", amount - numOfPapers); // 20-10
//             System.out.println(numOfPapers + "장만 출력합니다.");
//             numOfPapers = 0;
//         } else {
//             numOfPapers -= amount; // 10 - 2
//             System.out.print(amount + "장 출력했습니다.");
//             System.out.println("현재" + numOfPapers + "장 남아있습니다.");

//         }
//     }
// }

//03번
class Printer {
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount) {
        if (getDuplex()) {
            amount = (amount % 2 == 0) ? amount / 2 : amount / 2 + 1;
            System.out.print("양면으로 ");
        } else
            System.out.print("단면으로 ");
        if (numOfPapers == 0)
            System.out.println("용지가 없습니다. ");
        else if (numOfPapers < amount) {
            System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. ", amount - numOfPapers);
            System.out.println(numOfPapers + "장만 출력합니다.");
            numOfPapers = 0;
        } else {
            numOfPapers -= amount;
            System.out.print(amount + "장 출력했습니다.");
            System.out.println("현재" + numOfPapers + "장 남아있습니다.");
        }
    }

    public boolean getDuplex() {
        return duplex;

    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}

public class PrinterTest {

    public static void main(String[] args) {
        Printer p = new Printer(20, true);

        p.print(25);
        p.setDuplex(false);
        p.print(10);
        // p.print = amount = 출력 용지수

    }
}