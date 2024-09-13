// Parent class
class Vehicle {
    String type;

    // Parent class constructor
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called.");
    }
}

// Child class
class Car extends Vehicle {
    String model;

    // Child class constructor
    Car(String type, String model) {
        super(type); // Calling parent class constructor
        this.model = model;
        System.out.println("Car constructor called.");
    }

    void displayDetails() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Car Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car car1 = new Car("Sedan", "Audi");
        car1.displayDetails();
    }
}
