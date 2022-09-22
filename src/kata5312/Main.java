package kata5312;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split("\\s+");

        double sum = 0;
        for (String word : strings) {
            if (isNumber(word)) {
                sum += Double.parseDouble(word);
            }
        }

        System.out.printf("%.6f", sum);
    }

    public static boolean isNumber(String input) {
        try {
            double d = Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
