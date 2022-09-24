package kata527;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        byte[] buf = {1, 2, 4, -1, -10};
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        System.out.println(sumOfStream(bais));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int i;
        while((i = inputStream.read()) != -1) {
            byte b = (byte)i;
            sum += b;
        }
        return sum;
    }
}