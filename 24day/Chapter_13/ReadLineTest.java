import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadLineTest {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        boolean cont = true;
        String line = null;

        while (cont) {
            System.out.println("input line : ");
            try {
                line = br.readLine();
            } catch (Exception e) {
                // TODO: handle exception

            }
            if (line.length() == 0)
                break;
            System.out.println("output : " + line);
        }

    }
}
