package kata6genericsTests;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        boolean addedto = stringSet.add("One");
        addedto = stringSet.add("Two");
        addedto = stringSet.add("One");
        addedto = stringSet.add("Three");
        addedto = stringSet.add("Four");
        Stack<String> stst = new Stack<>();

        List<Integer> li = Arrays.asList(4, 5, 6);
        List<? extends Number> ln = li;
        ln.add(1, null);
    }
}
