class Calculator {
    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (2 args): " + calc.add(10, 20));
        System.out.println("Sum (3 args): " + calc.add(10, 20, 30));
    }
}
