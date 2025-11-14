package PW4.Task_20;

public class Triple<T extends Comparable<T>, V extends Animal, K> {
    private T first;
    private V second;
    private K third;
    
    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public T getFirst() { return first; }
    public V getSecond() { return second; }
    public K getThird() { return third; }
    
    public void setFirst(T first) { this.first = first; }
    public void setSecond(V second) { this.second = second; }
    public void setThird(K third) { this.third = third; }
    
    public void printClassNames() {
        System.out.println("Тип первого элемента: " + first.getClass().getSimpleName());
        System.out.println("Тип второго элемента: " + second.getClass().getSimpleName());
        System.out.println("Тип третьего элемента: " + third.getClass().getSimpleName());
    }
    
    public boolean isFirstGreaterThan(T other) {
        return first.compareTo(other) > 0;
    }
    
    @Override
    public String toString() {
        return "Triple[" + first + ", " + second + ", " + third + "]";
    }
}