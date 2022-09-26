package sec02;

public class SystemDemo {
    public static void main(String[] args) {
        int[] src = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] dst = { 100, 200, 300, 400, 500, 600, 700 };
        System.arraycopy(src, 2, dst, 3, 4);
        for (int i = 0; i < dst.length; i++) {
            System.out.println(dst[i] + " ");

        }
        System.out.println();

        System.out.println(System.currentTimeMillis());
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.nanoTime());
    }
}
