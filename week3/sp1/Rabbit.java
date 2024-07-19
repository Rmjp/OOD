package week3.sp1;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }
    
}
