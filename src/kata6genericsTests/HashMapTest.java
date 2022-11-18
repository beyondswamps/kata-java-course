package kata6genericsTests;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Number> m = new HashMap<>();
        m.put("One", 1);
        m.put("Два", 2);
        m.put("Three", 3.3);
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

        String str = "Thirteen";
        int myhash = (str.hashCode()) ^ (str.hashCode() >>> 16);

        Set<Map.Entry<String, Number>> sme = m.entrySet();

        System.out.println(m);

    }
}
