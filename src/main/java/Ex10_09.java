import java.io.FileInputStream;

public class Ex10_09 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/test/Java.txt");

        int ch;

        while ( (ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();
    }
}
