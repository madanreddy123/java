package hasarelationship;

/**
 * This class demonstrates the "has-a" relationship between Car and Engine.
 */
public class HasARelationshipDemo {

    public static void main(String[] args) {
        // Create an instance of the Car class.
        // When the Car is created, it automatically gets an Engine.
        Car myCar = new Car();

        // Call the methods of the Car object.
        myCar.startCar();
        myCar.drive();
    }
}
