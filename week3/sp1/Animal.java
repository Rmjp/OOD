package week3.sp1;

public abstract class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}
