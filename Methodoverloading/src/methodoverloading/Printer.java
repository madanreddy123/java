package methodoverloading;

/**
 * This class demonstrates method overloading.
 * Method overloading is a feature that allows a class to have more than one method with the same name,
 * as long as their parameter lists are different.
 */
public class Printer {

    /**
     * This is the first version of the print method. It takes no parameters.
     */
    public void print() {
        System.out.println("Printing with no arguments.");
    }

    /**
     * This is an overloaded version of the print method. It takes an integer parameter.
     * @param number The integer to print.
     */
    public void print(int number) {
        System.out.println("Printing number: " + number);
    }

    /**
     * This is another overloaded version of the print method. It takes a String parameter.
     * @param text The string to print.
     */
    public void print(String text) {
        System.out.println("Printing text: " + text);
    }

    /**
     * This is a third overloaded version of the print method.
     * It takes an integer and a String parameter.
     * @param number The integer to print.
     * @param text The string to print.
     */
    public void print(int number, String text) {
        System.out.println("Printing number: " + number + " and text: " + text);
    }
}
