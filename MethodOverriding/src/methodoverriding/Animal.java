package methodoverriding;

/**
 * This is the parent class (or superclass).
 * It represents a generic Animal.
 */
public class Animal {
    /**
     * This method represents the sound an animal makes.
     * Subclasses can override this method to provide a more specific sound.
     */
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}
