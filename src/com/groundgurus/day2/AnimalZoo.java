package com.groundgurus.day2;

import java.util.List;

/**
 *
 * @author penguin
 */
public class AnimalZoo {
    private List<Animal> animals;

    public AnimalZoo(List<Animal> animals) {
        this.animals = animals;
    }
    
    public void walkAllAnimals() {
        for (Animal animal : animals) {
            walkAnimal(animal);
        }
    }
    
    public void walkAnimal(Animal animal) {
        animal.walk();
    }
}
