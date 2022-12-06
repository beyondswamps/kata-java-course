package kata7212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, "UTF-8").useDelimiter("[^A-Za-z0-9А-Яа-я]+");
        Map<String, Long> rateMap = sc.tokens()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        rateMap
                .keySet()
                .stream()
                .sorted()
                .sorted((str1, str2) -> (int) (rateMap.get(str2) - rateMap.get(str1)))
                .limit(10)
                .forEach(System.out::println);
    }
}
