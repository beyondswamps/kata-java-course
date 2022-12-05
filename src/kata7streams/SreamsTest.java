package kata7streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SreamsTest {
    public static void main(String[] args) {
        Supplier<Stream<Integer>> streamSupplier = () -> Stream.of(5, 3, 2, 10, 8);
        Stream.of(1,2,3,4,5,6).map(n -> n * n).forEach(System.out::println);

    }
}
