package runtimepolymorphism;

/**
 * This class demonstrates runtime polymorphism.
 */
public class RuntimePolymorphismDemo {

    public static void main(String[] args) {
        // --- Demonstrating Polymorphism ---
        // We can create an array of Shape references.
        Shape[] shapes = new Shape[3];

        // We can store objects of any subclass of Shape in this array.
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        // Now, we can iterate through the array and call the draw() method on each shape.
        // This is where runtime polymorphism happens.
        // The JVM determines at runtime which version of the draw() method to call
        // based on the actual type of the object being referred to.
        System.out.println("Drawing all shapes in the array:");
        for (Shape shape : shapes) {
            shape.draw(); // The correct draw() method is called for each object.
        }

        System.out.println("\n--- Another Example ---");
        // We can also use a single Shape reference to point to different objects.
        Shape currentShape;

        System.out.println("Using a single reference to draw different shapes:");
        currentShape = new Circle();
        currentShape.draw(); // Calls Circle's draw()

        currentShape = new Square();
        currentShape.draw(); // Calls Square's draw()
    }
}
