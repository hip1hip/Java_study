public class DoWhile2Demo {
    public static void main(String[] args) {
        int i = 10;
        do {
            i++;
        } while (i < 5);
        System.out.println("do-while 문 실행 후 : " + i);

        i = 10;
        while (i < 5) {
            i++;
        }
        System.out.print("while 문 실행 후 : " + i);
    }
}
