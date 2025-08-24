package hasarelationship;

/**
 * This class represents a Car. It has an Engine.
 * This is an example of a "has-a" relationship (composition).
 * The Car class has an instance of the Engine class.
 */
public class Car {
    // The Car has an Engine. This is the "has-a" relationship.
    // It is marked as 'final' to ensure that every Car has an Engine, and it cannot be changed after the Car is created.
    private final Engine engine;

    /**
     * This is the constructor for the Car class.
     * When a new Car is created, a new Engine is also created and associated with the Car.
     * This is how we fix the NullPointerException.
     */
    public Car() {
        this.engine = new Engine();
    }

    /**
     * This method starts the car by starting its engine.
     */
    public void startCar() {
        System.out.println("Car is starting...");
        engine.start();
    }

    /**
     * This method represents driving the car.
     */
    public void drive() {
        System.out.println("Car is moving.");
    }
}
