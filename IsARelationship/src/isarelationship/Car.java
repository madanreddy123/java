package isarelationship;

/**
 * This is the child class (or subclass). It inherits from the Vehicle class.
 * A Car "is-a" Vehicle. This is the "is-a" relationship.
 * The Car class inherits the properties and methods of the Vehicle class.
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * This is the constructor for the Car class.
     * The 'super()' call invokes the constructor of the parent class (Vehicle).
     * It's good practice to call the parent constructor explicitly.
     */
    public Car(String brand, int doors) {
        super(); // Calls the Vehicle() constructor
        this.brand = brand; // We can access the 'brand' field because it is 'protected' in Vehicle
        this.numberOfDoors = doors;
        System.out.println("A new Car is created.");
    }

    /**
     * This is a method specific to the Car class.
     */
    public void drive() {
        System.out.println("The car is driving.");
    }

    /**
     * This method displays the details of the car.
     */
    public void displayCarDetails() {
        System.out.println("Number of doors: " + this.numberOfDoors);
    }
}
