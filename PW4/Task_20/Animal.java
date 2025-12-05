package PW4.Task_20;

public class Animal implements Comparable<Animal> {
    private final String name;
    private final int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return name + " (возраст: " + age + ")";
    }

    public int compareTo(Animal a){
        return this.age - a.age;
    }
}