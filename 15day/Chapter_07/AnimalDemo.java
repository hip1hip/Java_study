interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("먹엄검ㅇ멍~~");
    }
}

class Cuckoo implements Animal {
    public void sound() {
        System.out.println("뻐꾸국~~");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {
        Dog d = new Dog();
        Cuckoo c = new Cuckoo();

        makeSound(d);
        makeSound(c);
    }

    static void makeSound(Animal a) {
        a.sound();
    }
}
