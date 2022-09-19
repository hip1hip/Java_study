public class MainArgumentDemo {
    public static void main(String[] args) {
        if (args.length == 2) {
            int i = Integer.parseInt(args[1]);
            nPrintln(args[0], i);

        } else
            System.out.println("어이쿠!");
    }
    /// 이클립스 메인 메서드의 인수 추가 해야함.
    /// 예저는 안녕! 세번 반복됌

    public static void nPrintln(String s, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(s);

    }
}
