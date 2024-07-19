import week3.sp1.*;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.makeSound();
        Rabbit rabbit = new Rabbit("Bunny");
        rabbit.makeSound();
        AnimalHome home = new AnimalHome();
        home.addAnimal(dog);
        home.addAnimal(rabbit);

        for (Animal animal : home.getAll()) {
            if(animal instanceof Dog) {
                System.out.println("Dog has " + ((Dog) animal).getNumberOfLegs() + " legs");
            }
            if(animal.getClass() == Rabbit.class) {
                System.out.println("Rabbit is a rabbit");
            }
        }
    }

}
