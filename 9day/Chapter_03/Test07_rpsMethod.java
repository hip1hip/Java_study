import java.util.Scanner;

public class Test07_rpsMethod {

    static String input(String s) {
        Scanner in = new Scanner(System.in);
        System.out.print(s + ": ");
        return in.next();

    }

    static void whosWin(String s1, String s2) {
        if (s1.equals(s2))
            System.out.println("무승부!");
        else if (s1.equals("r")) {
            if (s2.equals("p"))
                System.out.println("영희 승!");
            else
                System.out.println("철수 승!");
        } else if (s1.equals("p")) {
            if (s2.equals("s"))
                System.out.println("영희 승!");
            else
                System.out.println("철수 승!");
        } else {
            if (s2.equals("r"))
                System.out.println("영희 승!");
            else
                System.out.println("철수 승!");
        }
    }

    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
    }

}
