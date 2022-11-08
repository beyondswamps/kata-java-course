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
        String employeeName;
        Long employeeSalesAmount;
        while (sc.hasNext()) {
            employeeName = sc.next();
            employeeSalesAmount = sc.nextLong();
            if (salesMap.containsKey(employeeName)) {
                salesMap.put(employeeName, salesMap.get(employeeName) + employeeSalesAmount);
            } else {
                salesMap.put(employeeName, employeeSalesAmount);
            }
        }
        return salesMap;
    }

    public static void main(String[] args) {
        Map<String, Long> msl = getSalesMap(new InputStreamReader(System.in));
        System.out.println(msl);
    }
}
