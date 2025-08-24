package interfaces;

/**
 * This class Circle implements the Drawable interface.
 * It provides a concrete implementation for the methods defined in Drawable.
 */
public class Circle implements Drawable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * This is the implementation of the draw() method from the Drawable interface.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + this.radius);
        // In a real application, this would contain graphics drawing code.
    }

    /**
     * This is the implementation of the getInfo() method from the Drawable interface.
     * @return A string with information about the circle.
     */
    @Override
    public String getInfo() {
        return "This is a Circle with radius " + this.radius;
    }
}
