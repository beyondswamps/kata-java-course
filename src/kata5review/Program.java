package kata5review;

import java.io.*;


public class Program {
    public static void main(String[] args) throws IOException {
        //FileInputStream fis = new FileInputStream("some.txt");
        //fis.close();
        RandomAccessFile raf = new RandomAccessFile("output.txt", "rw");
        raf.write("Hi space!".getBytes());
        raf.write("Bye!".getBytes());
        raf.seek(3);
        raf.write("2".getBytes());
        raf.seek(6);
        raf.write("3".getBytes());
        raf.seek(0);
        raf.write("0".getBytes());
        raf.setLength(500);
        raf.close();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"));
    }
}
