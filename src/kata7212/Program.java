package kata7212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, "UTF-8");
//        String phrase = sc.next();
        Map<String, Long> result = Arrays.stream(sc.nextLine().toLowerCase().split("[^A-Za-z0-9А-Яа-я]+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        result
                .keySet()
                .stream()
                .sorted()
                .sorted((str1, str2) -> (int) (result.get(str2) - result.get(str1)))
                .limit(10)
                .forEach(System.out::println);
    }
}
