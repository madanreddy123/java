package interfaces;

/**
 * This class demonstrates the use of interfaces and polymorphism.
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        // Create an instance of the Circle class.
        Circle myCircle = new Circle(5.0);

        // We can also create a reference of the interface type.
        // This is a powerful feature of interfaces, allowing for polymorphism.
        // Any class that implements Drawable can be assigned to this variable.
        Drawable drawableObject = myCircle;

        System.out.println("--- Calling methods on the Circle object directly ---");
        System.out.println(myCircle.getInfo());
        myCircle.draw();

        System.out.println("\n--- Calling methods through the Drawable interface reference ---");
        // We can call any method defined in the Drawable interface.
        System.out.println(drawableObject.getInfo());
        drawableObject.draw();
    }
}
