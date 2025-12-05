package PW5.Task_21;

public class GenericArrayWithGet<T> {
    private T[] array;

    public GenericArrayWithGet(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }
}