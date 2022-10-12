import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class DoubleTest {
    public static void main(String[] args) {
        InputStream is = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        double[] dbuf = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        try {
            fos = new FileOutputStream("D:\\Temp\\double.txt");
            dos = new DataOutputStream(fos);

            for (double d : dbuf) {
                dos.writeDouble(d);
            }

            dos.flush();

            is = new FileInputStream("D:\\Temp\\double.txt");
            dis = new DataInputStream(is);
            while (dis.available() > 0) {
                double c = dis.readDouble();
                System.out.print(c + " ");

            }
            is.close();
            is.close();
            dis.close();
            fos.close();
        } catch (Exception e) {

        }

    }
}
