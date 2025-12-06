/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorefisme;

/**
 *
 * @author Nazwajafni
 */
import java.util.ArrayList;
import java.util.List;

class Animal {
    void speak() {
        System.out.println("Animal speaks...");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog: Guk guk!");
    }
    void fetch() {
        System.out.println("Dog is fetching the bone!");
    }
}

class Bird extends Animal {
    @Override
    void speak() {
        System.out.println("Bird: Cici cuit!");
    }
}
public class Latihan1 {
        public static void main(String[] args) {

        java.util.List<Animal> animals = new java.util.ArrayList<>();
        animals.add(new Dog());
        animals.add(new Bird());
        animals.add(new Dog());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.speak();
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            }
        }
    }
}