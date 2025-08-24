package runtimepolymorphism;

/**
 * A concrete subclass of Shape.
 */
public class Triangle extends Shape {
    /**
     * This is the implementation of the abstract draw() method for a Triangle.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}
