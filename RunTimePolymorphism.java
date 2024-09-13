// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference, Animal object
        Animal myDog = new Dog(); // Animal reference, Dog object

        myAnimal.sound(); // Calls Animal's method
        myDog.sound(); // Calls Dog's overridden method (Run-time Polymorphism)
    }
}
