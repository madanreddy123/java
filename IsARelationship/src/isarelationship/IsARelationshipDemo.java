package isarelationship;

/**
 * This class demonstrates the "is-a" relationship (inheritance).
 */
public class IsARelationshipDemo {

    public static void main(String[] args) {
        // Create an instance of the Car class.
        Car myCar = new Car("Toyota", 4);

        System.out.println("\n--- Demonstrating Inheritance ---");
        // We can call methods from the Car class.
        myCar.drive();
        myCar.displayCarDetails();

        // We can also call methods from the Vehicle class because Car inherits from Vehicle.
        myCar.start();
        myCar.displayBrand();
        myCar.stop();
    }
}
