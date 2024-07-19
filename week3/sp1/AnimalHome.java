package week3.sp1;

import java.util.ArrayList;

public class AnimalHome {
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animal.makeSound();
        animals.add(animal);
    }

    public ArrayList<Animal> getAll(){
        return animals;
    }
}
