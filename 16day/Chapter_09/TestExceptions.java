//원서 978p 개발자 홍인표 

public class TestExceptions {
    public static void main(String[] args) {

        String test = "no";
        // String test = "yes"; // yes 로 바꿀시 end risky , end try 는 출력이 안된다.

        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }

    private static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
    }
}

class ScaryException extends Exception {

}