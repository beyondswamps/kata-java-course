package kata7212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws IOException {
        new BufferedReader(new InputStreamReader(System.in, "UTF-8"))
                .lines()
                .map(str -> str.split("[^\\wА-Яа-яËё+]"))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}
