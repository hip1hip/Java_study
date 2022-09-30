package Tset;

import java.util.function.Supplier;

public class AnimalTest {
    public static void main(String[] args) {
        soundAnimal(Animal::new);
        soundAnimal(Dog::new);

    }

    public static void soundAnimal(Supplier<Animal> s) {
        s.get().sound();
    }

}

class Animal {
    public void sound() {
        System.out.println("ㅁㅁㄲㄲ..");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍");
    }
}