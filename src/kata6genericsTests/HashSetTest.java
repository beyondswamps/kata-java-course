package kata6genericsTests;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        boolean addedto = stringSet.add("One");
        addedto = stringSet.add("Two");
        addedto = stringSet.add("One");
        addedto = stringSet.add("Three");
        addedto = stringSet.add("Four");
    }
}
