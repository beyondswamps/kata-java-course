package kata6214;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sales {
    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salesMap = new HashMap<>();
        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            salesMap.merge(sc.next(), sc.nextLong(), (oldValue, newValue) -> oldValue + newValue);
        }
        return salesMap;
    }

    public static void main(String[] args) {
        Map<String, Long> msl = getSalesMap(new InputStreamReader(System.in));
        System.out.println(msl);
    }
}
