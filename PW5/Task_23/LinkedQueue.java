package PW5.Task_23;

public class LinkedQueue {
    private static class Node {
        Object data;
        Node next;
        Node(Object data) { this.data = data; }
    }

    private Node front, rear;
    private int size;

    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (rear != null) rear.next = newNode;
        rear = newNode;
        if (front == null) front = newNode;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue empty");
        Object data = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return data;
    }

    public Object element() {
        if (isEmpty()) throw new IllegalStateException("Queue empty");
        return front.data;
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void clear() {
        front = rear = null;
        size = 0;
    }
}