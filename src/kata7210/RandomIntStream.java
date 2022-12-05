package kata7210;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomIntStream {
    public static void main(String[] args) {
        pseudoRandomStream(13);
    }

    public static IntStream pseudoRandomStream(int seed){
        return IntStream.iterate(seed, n -> n * n % 10000 / 10);
    }
}