/**
 * This is an abstract class representing an Animal.
 * An abstract class is a class that cannot be instantiated on its own and must be subclassed.
 * It can have both abstract methods (methods without a body) and concrete methods (methods with a body).
 */
public abstract class Animal {

    /**
     * This is a concrete method. All animals share this behavior.
     */
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }

    /**
     * This is another concrete method.
     */
    public void eat() {
        System.out.println("This animal is eating.");
    }

    /**
     * This is an abstract method.
     * It doesn't have a body, and it must be implemented by any concrete subclass.
     * The specific sound an animal makes is left to the subclass to define.
     */
    public abstract void makeSound();
}
