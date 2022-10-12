import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class IOTest {
    public static void main(String[] args) {
        String fileName = "D:\\Temp\\file.txt";

        // String line = null;

        // try {

        // FileReader fr = new FileReader(fileName);
        // BufferedReader br = new BufferedReader(fr);

        // while ((line = br.readLine()) != null)
        // System.out.println(line);

        // fr.close();
        // br.close();

        try {
            Files.lines(new File(fileName).toPath()).forEach(l -> System.out.println(l));

        } catch (

        FileNotFoundException ex) {
            System.out.println(fileName + " 파일을 열 수 없습니다.");
        } catch (IOException ex) {
            System.out.println(fileName + " 파일을 읽을 수 없습니다. ");
        }
    }
}
