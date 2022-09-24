package kata5312;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        double sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                d = scanner.nextDouble();
                sum += d;
            } else {scanner.next();}
        }
        scanner.close();
        System.out.printf("%.6f", sum);
    }
}
