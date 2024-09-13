// Interface declaration
interface USBDevice {
    void plugIn();
    void unplug();
}

// Unrelated class 1
class Printer implements USBDevice {
    @Override
    public void plugIn() {
        System.out.println("Printer is plugged into USB port.");
    }

    @Override
    public void unplug() {
        System.out.println("Printer is unplugged from USB port.");
    }

    public void printDocument() {
        System.out.println("Printing document...");
    }
}

// Unrelated class 2
class Scanner implements USBDevice {
    @Override
    public void plugIn() {
        System.out.println("Scanner is plugged into USB port.");
    }

    @Override
    public void unplug() {
        System.out.println("Scanner is unplugged from USB port.");
    }

    public void scanDocument() {
        System.out.println("Scanning document...");
    }
}

public class InterfaceNonHierarchyExample {
    public static void main(String[] args) {
        // Create objects of unrelated classes
        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        // Both implement the common interface
        printer.plugIn();
        printer.printDocument();
        printer.unplug();

        System.out.println(); // Line break

        scanner.plugIn();
        scanner.scanDocument();
        scanner.unplug();
    }
}
