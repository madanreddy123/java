package runtimepolymorphism;

/**
 * This is an abstract class representing a generic Shape.
 * It serves as the base class for demonstrating polymorphism.
 * We cannot create an instance of an abstract class.
 */
public abstract class Shape {
    /**
     * This is an abstract method.
     * It has no implementation here. Each concrete subclass must provide its own implementation.
     * This allows us to treat different shapes uniformly, calling draw() on any of them.
     */
    public abstract void draw();
}
