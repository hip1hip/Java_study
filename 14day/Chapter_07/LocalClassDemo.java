public class LocalClassDemo {
    private String s1 = "외부";

    void method() {
        int x = 1;
        class LocalClass {
            String s2 = "내부";
            String s3 = s1;

            public void show() {
                System.out.println("지역 클래스");
            }
        }

        LocalClass lc = new LocalClass();
        System.out.println(lc.s2);
        lc.show();

    }

    public static void main(String[] args) {
        LocalClassDemo icd = new LocalClassDemo();
        icd.method();
    }
}
