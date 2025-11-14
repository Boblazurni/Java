package PW4.Task_20;

import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;
    
    public MinMax(T[] array) {
        this.array = array != null ? array.clone() : null;
    }
    
    public T findMin() {
        if (array == null || array.length == 0) {
            return null;
        }
        
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
    
    public T findMax() {
        if (array == null || array.length == 0) {
            return null;
        }
        
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    
    public void printArray() {
        if (array == null) {
            System.out.println("Массив: null");
            return;
        }
        System.out.println("Массив: " + Arrays.toString(array));
    }
}