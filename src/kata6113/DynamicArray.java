package kata6113;

import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] array;

    int size = 0;
    int actualSize = 10;

    public DynamicArray() {
        array = new Object[actualSize];
    };

    public void add(T el) {
        if (size < actualSize) {
            array[size++] = el;
        } else {
            actualSize += 10;
            Object[] newArray  = new Object[actualSize];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            array[size++] = el;
        }
    }

    public void remove(int index) {
        if (index > size || index < 0) {
            System.out.println("Index is out of bounds");
            return;
        }
        Object[] newArray = new Object[size - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < size; i++) {
            newArray[i - 1] = array[i];
        }
        array = newArray;
        size--;
    }

}
