package PW5.Task_23;

import java.util.Arrays;

public class ArrayQueue {
    private Object[] elements;
    private int front, rear, size;

    public ArrayQueue(int capacity) {
        elements = new Object[capacity];
        front = 0; rear = -1; size = 0;
    }

    public void enqueue(Object element) {
        if (size == elements.length) throw new IllegalStateException("Queue full");
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue empty");
        Object element = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    public Object element() {
        if (isEmpty()) throw new IllegalStateException("Queue empty");
        return elements[front];
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void clear() {
        Arrays.fill(elements, null);
        front = 0; rear = -1; size = 0;
    }
}