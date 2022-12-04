package kata7211;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        T min, max;
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            min = list.stream().min(order).get();
            max = list.stream().max(order).get();
            minMaxConsumer.accept(min, max);
        }
    }
}
