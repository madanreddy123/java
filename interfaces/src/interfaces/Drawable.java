package interfaces;

/**
 * This is an interface named Drawable.
 * An interface is a completely abstract class that is used to group related methods with empty bodies.
 * A class that implements an interface must implement all the methods declared in the interface.
 * Interfaces are used to achieve abstraction and multiple inheritance in Java.
 */
public interface Drawable {
    // By default, all methods in an interface are public and abstract.
    // So, 'public abstract' is redundant, but we can keep it for clarity.
    void draw();
    String getInfo();
}
