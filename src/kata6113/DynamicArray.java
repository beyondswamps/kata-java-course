package kata6113;

import java.util.*;
import java.util.Arrays;
import java.util.function.Supplier;

public class DynamicArray<T> {
    private Object[] array;
    int size = 0;
    int actualSize = 10;

    public DynamicArray() {
        array = new Object[actualSize];
    }

    public void add(T el) {
        if (size < actualSize) {
            array[size++] = el;
        } else {
            actualSize *= 1.5;
            array = Arrays.copyOf(array, actualSize);
            array[size++] = el;
        }
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException{
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T)array[index];
    }

    public static void main(String[] args) {
        DynamicArray<Integer> dai = new DynamicArray<>();
        dai.add(60);
        dai.add(4);
        dai.add(8);
        dai.add(2000);
        dai.add(2001);
        dai.add(202);
        System.out.println(dai.get(3));
        System.out.println(dai.get(2));
        dai.remove(2);
        Collection<?> coll = new HashSet<>();
        Object obj = new Object();
        coll.remove(obj);
        coll.toArray();
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;

    }

    void foo(List<?> i) {
        Object obj = i.get(0);
    }
}
