package kata7211;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MinMaxInStream {
    public static void main(String[] args) {
        Stream<Integer> si = Stream.of(1,2,3,4,5);
        System.out.println("breakpoint!");
    }

    public static <T> void findMinMaX(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

    }
}
