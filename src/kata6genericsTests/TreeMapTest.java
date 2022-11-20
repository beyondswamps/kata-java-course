package kata6genericsTests;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();
        m.put("One", 1);
        m.put("Два", 2);
        m.put("Three", 3);
        m.put("Four", 4);
        m.put("Five", 5);
        m.put("Six", 6);
        m.put("Seven", 7);
        m.put("Eight", 8);
        m.put("Nine", 9);
        m.put("Ten", 10);
        m.put("Eleven", 11);
        m.put("Twelve", 12);
        m.put("Thirteen", 13);

        Collection<Integer> vals = m.values();
        System.out.println(m);
    }
}
