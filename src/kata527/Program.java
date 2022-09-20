package kata527;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {

    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int i;
        while((i = inputStream.read()) != -1) {
            i = inputStream.read();
            sum += i;
        }
        return sum;
    }
}