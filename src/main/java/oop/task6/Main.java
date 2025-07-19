package oop.task6;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        List<Animal> animals = List.of(dog, cat);

        for (Animal a : animals) {
            a.makeSound();
        }


    }
}
