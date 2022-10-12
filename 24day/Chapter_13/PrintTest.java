import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintTest {
    public static void main(String[] args) throws Exception {
        String[] animals = { "ant", "bat", "cat", "dog" };
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\print.txt");
        PrintStream ps = new PrintStream(fos);

        for (int i = 0; i < animals.length; i++) {
            ps.printf("%c : %s", animals[i].charAt(0), animals[i]);
            ps.println();

        }
        ps.close();
        fos.close();

    }
}
