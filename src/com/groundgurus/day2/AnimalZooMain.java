package com.groundgurus.day2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author penguin
 */
public class AnimalZooMain {

    public static void main(String[] args) {
        AnimalZoo manilaZoo = 
                new AnimalZoo(
                        Arrays.asList(
                                new Dog(),
                                new Dog(),
                                new Dog())
                );
        manilaZoo.walkAllAnimals();
    }
}
