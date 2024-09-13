// Class with constructor
class Car {
    String model;
    int year;

    // Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object using the constructor
        Car car1 = new Car("Tesla", 2022);
        car1.displayDetails();
    }
}
