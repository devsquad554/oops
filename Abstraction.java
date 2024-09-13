// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child class providing implementation of abstract method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Shape s = new Shape(); // This will give an error

        // Instantiate concrete class
        Shape circle = new Circle();
        circle.draw(); // Calls abstract method's implementation
        circle.display(); // Calls concrete method from abstract class
    }
}
