package runtimepolymorphism;

/**
 * A concrete subclass of Shape.
 */
public class Circle extends Shape {
    /**
     * This is the implementation of the abstract draw() method for a Circle.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
