package kata7212;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, "UTF-8").useDelimiter("[^A-Za-z0-9А-Яа-я]+");
        sc.tokens()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((entry1, entry2) -> (int) (entry2.getValue() - entry1.getValue()))
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}
