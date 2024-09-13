// This code won't compile in Java due to the diamond problem

class Vehicle {
    public void fuelType() {
        System.out.println("General vehicle fuel type");
    }
}

class ElectricCar extends Vehicle {
    @Override
    public void fuelType() {
        System.out.println("Electric car runs on electricity");
    }
}

class PetrolCar extends Vehicle {
    @Override
    public void fuelType() {
        System.out.println("Petrol car runs on petrol");
    }
}

// Trying to inherit from both ElectricCar and PetrolCar causes the diamond problem
class HybridCar extends ElectricCar, PetrolCar {
    // Which fuelType method should HybridCar inherit? Ambiguity!
}

public class DiamondProblemExample {
    public static void main(String[] args) {
        HybridCar car = new HybridCar();
        car.fuelType(); // Compilation error due to ambiguity
    }
}
