package kata528;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Program {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {1, 2, 4, -1, -10, 8, 8, 8, 8, 8, 8, 8, 8, 8};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        OutputStream sysout = System.out;
        print(bais, sysout);
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        while((i = inputStream.read()) != -1) {
            byte b = (byte)i;
            if (b % 2 == 0) {
                outputStream.write(b);
                outputStream.flush();
            }
        }
        inputStream.close();
        outputStream.close();

        outputStream.write((byte)108);
        outputStream.close();
    }
}