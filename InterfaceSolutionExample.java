// Interface definition for vehicles
interface Vehicle {
    void fuelType();
}

// ElectricCar interface implementing Vehicle
interface ElectricCar extends Vehicle {
    @Override
    default void fuelType() {
        System.out.println("Electric car runs on electricity");
    }
}

// PetrolCar interface implementing Vehicle
interface PetrolCar extends Vehicle {
    @Override
    default void fuelType() {
        System.out.println("Petrol car runs on petrol");
    }
}

// HybridCar implements both ElectricCar and PetrolCar interfaces
class HybridCar implements ElectricCar, PetrolCar {
    // Override to resolve the ambiguity of fuelType()
    @Override
    public void fuelType() {
        System.out.println("Hybrid car can run on both electricity and petrol");
        
        // Optionally, you can call specific implementations from ElectricCar or PetrolCar
        ElectricCar.super.fuelType(); // Calls the ElectricCar version of fuelType
        PetrolCar.super.fuelType();   // Calls the PetrolCar version of fuelType
    }
}

public class InterfaceSolutionExample {
    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar();
        hybridCar.fuelType();  // Resolves the ambiguity and calls HybridCar's version
    }
}
