// Class definition
class Car {
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;

        // Calling method on object
        car1.displayDetails();
    }
}
