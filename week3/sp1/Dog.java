package week3.sp1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
    
    public int getNumberOfLegs() {
        return 4;
    }

}
