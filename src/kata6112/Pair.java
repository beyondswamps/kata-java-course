package kata6112;

import java.util.Objects;

public class Pair<F, S> {
    private final F first;

    private final S second;

    private Pair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public static <F, S> Pair<F, S> of(F f, S s) {
        return new Pair<>(f, s);
    }

    public F getFirst(){
        return this.first;
    }

    public S getSecond(){
        return this.second;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null && getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return Objects.equals(getFirst(), pair.getFirst()) && Objects.equals(getSecond(), pair.getSecond());
    }

    public int hashCode() {
        return Objects.hashCode(getFirst()) * 31 + Objects.hashCode(getSecond());
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }
}
