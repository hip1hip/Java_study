import java.io.File;

public class FileExistTest {
    public static void main(String[] args) {
        File f = new File("D:\\Temp\\file.txt");
        if (f.exists())
            System.out.println("found.");
        else
            System.out.println("not found");
    }
}
