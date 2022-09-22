package kata5311;

import java.io.*;
import java.nio.charset.Charset;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        byte[] bytes = {48, 49, 50, 51};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        System.out.println(readAsString(bais, Charset.forName("ASCII")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader isr = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int i;
        while ((i = isr.read()) != -1) {
            sb.append((char)i);
        }
        return sb.toString();
    }
}
