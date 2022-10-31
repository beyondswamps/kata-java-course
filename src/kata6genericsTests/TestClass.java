package kata6genericsTests;

import java.util.ArrayList;

public class TestClass<T> {
    T value1;
    T value2;

    public static <T> TestClass<T> createAndAddValues(Object value1, Object value2) {
        TestClass<T> result = new TestClass<>();
        result.value1 = (T) value1;
        result.value2 = (T) value2;
        return result;
    }

    public void printValues() {
        System.out.println(value1);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        TestClass<Integer> testClass = createAndAddValues(123, "this string");
        testClass.printValues();
        ArrayList<?> ali = new ArrayList<Integer>();
        //ali.add(3);

        ArrayList<TestClass> alt = new ArrayList<>();
        System.out.println(ali.getClass());
        System.out.println(alt.getClass());
    }
}
