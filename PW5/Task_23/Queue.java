package PW5.Task_23;

public interface Queue {
    void enqueue(Object element);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}

public abstract class AbstractQueue implements Queue {
    protected int size = 0;
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
}