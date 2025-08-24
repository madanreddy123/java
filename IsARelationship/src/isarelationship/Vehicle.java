package isarelationship;

/**
 * This is the parent class (or superclass) in our inheritance example.
 * It represents a generic Vehicle.
 */
public class Vehicle {
    protected String brand;

    public Vehicle() {
        this.brand = "Unknown";
        System.out.println("A new Vehicle is created.");
    }

    public void start() {
        System.out.println("The vehicle's engine has started.");
    }

    public void stop() {
        System.out.println("The vehicle's engine has stopped.");
    }

    public void displayBrand() {
        System.out.println("Brand: " + this.brand);
    }
}
