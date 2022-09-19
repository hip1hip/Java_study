// Coding By 김용선.

// 01번
// class Printer {
//     int numOfPapers = 0;

//     public void print(int amount) {
//         numOfPapers -= amount;
//         System.out.println(numOfPapers);
//     }
// }

// 02번
// class Printer {
//     private int numOfPapers = 0;

//     public Printer(int numOfPapers) {
//         this.numOfPapers = numOfPapers;
//     }

//     public void print(int amount) {

//         if (numOfPapers == 0)
//             System.out.println("용지가 없습니다,");
//         else if (amount <= numOfPapers) {
//             numOfPapers -= amount;
//             System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
//         } else {
//             System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
//             numOfPapers = 0;

//         }
//     }
// }

// 03번
class Printer {
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount) {
        if (duplex == true) {
            amount = (amount % 2 == 0) ? amount / 2 : (amount / 2) + 1;

            if (numOfPapers == 0)
                System.out.println("용지가 없습니다,");
            else if (amount <= numOfPapers) {
                numOfPapers -= amount;
                System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
            } else {
                System.out.printf("양면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
                numOfPapers = 0;
            }
        } else {
            if (numOfPapers == 0)
                System.out.println("용지가 없습니다,");
            else if (amount <= numOfPapers) {
                numOfPapers -= amount;
                System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
            } else {
                System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
                numOfPapers = 0;
            }
        }
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}

public class PrinterTest_Dragon {
    public static void main(String[] args) {
        // 01번
        // Printer printer = new Printer(); // Printer클래스의 객체 생성.
        // printer.numOfPapers = 100; // 프린터에 용지 100장 추가
        // printer.print(70); // 프린터로 70장을 출력하고, 남은 용지 출력.

        // 02번
        // Printer p = new Printer(10);
        // p.print(2);
        // p.print(20);
        // p.print(10);

        // 03번
        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}