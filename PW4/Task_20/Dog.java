package PW4.Task_20;

public class Dog extends Animal {
    private final String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public String getBreed() { return breed; }
    
    @Override
    public String toString() {
        return super.toString() + ", порода: " + breed;
    }
}