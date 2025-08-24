package methodoverloading;

/**
 * This class demonstrates how to call overloaded methods.
 */
public class MethodOverloadingDemo {

    public static void main(String[] args) {
        // Create an instance of the Printer class.
        Printer myPrinter = new Printer();

        // Call the print method with no arguments.
        System.out.println("Calling print() with no arguments:");
        myPrinter.print();
        System.out.println("--------------------");

        // Call the print method with an integer argument.
        System.out.println("Calling print() with an integer:");
        myPrinter.print(10);
        System.out.println("--------------------");

        // Call the print method with a String argument.
        System.out.println("Calling print() with a String:");
        myPrinter.print("Hello, Java!");
        System.out.println("--------------------");

        // Call the print method with an integer and a String argument.
        System.out.println("Calling print() with an integer and a String:");
        myPrinter.print(20, "This is cool!");
        System.out.println("--------------------");
    }
}
