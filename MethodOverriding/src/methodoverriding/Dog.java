package methodoverriding;

/**
 * This is the child class (or subclass). It inherits from Animal.
 * It overrides the makeSound() method to provide a specific implementation for a Dog.
 */
public class Dog extends Animal {

    /**
     * This method overrides the makeSound() method from the Animal class.
     * The @Override annotation is used to indicate that this method is intended
     * to override a method in a superclass. It's not required, but it helps
     * prevent errors. If you use it, the compiler will check that a method with
     * the same signature exists in the superclass.
     */
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
