public class TryCatch1Demo {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2 };
        try {
            System.out.println("마지막 원소=>" + array[3]); // array는 3개 원소만 있음, [3]은 없음 , 예외발생
            System.out.println("첫 번째 원소 =>" + array[0]); // 이전 실행문에서 예외가 발생했으므로 이 실행문 실행x

        } catch (ArrayIndexOutOfBoundsException e) { // e = 레퍼런스 변수
            System.out.println("원소가 존재하지 않습니다.");
        }
        System.out.println("어이쿠!!!");
    }
}
