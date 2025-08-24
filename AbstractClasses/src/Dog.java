/**
 * This is a concrete class Dog that extends the abstract class Animal.
 * It provides an implementation for the abstract method makeSound().
 */
public class Dog extends Animal {

    /**
     * This is the implementation of the abstract method makeSound() from the Animal class.
     * It provides the specific behavior for a Dog.
     */
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
