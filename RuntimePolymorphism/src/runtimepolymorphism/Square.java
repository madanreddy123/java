package runtimepolymorphism;

/**
 * A concrete subclass of Shape.
 */
public class Square extends Shape {
    /**
     * This is the implementation of the abstract draw() method for a Square.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
