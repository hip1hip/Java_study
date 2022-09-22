import static java.util.Arrays.sort;

import java.util.Calendar;

public class StaticImportDemo {

    public static void main(String[] args) {
        int[] date = { 3, 5, 1, 7 };
        sort(date);
        System.out.println(Calendar.JANUARY);
        Calendar.getInstance();

    }

}
