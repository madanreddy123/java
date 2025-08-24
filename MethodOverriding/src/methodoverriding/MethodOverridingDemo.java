package methodoverriding;

/**
 * This class demonstrates method overriding and runtime polymorphism.
 */
public class MethodOverridingDemo {

    public static void main(String[] args) {
        // Create an instance of the Animal class.
        Animal genericAnimal = new Animal();
        System.out.print("Generic Animal: ");
        genericAnimal.makeSound(); // Calls the method in the Animal class.
        genericAnimal.eat();

        System.out.println("--------------------");

        // Create an instance of the Dog class.
        Dog myDog = new Dog();
        System.out.print("Dog: ");
        myDog.makeSound(); // Calls the overridden method in the Dog class.
        myDog.eat(); // Calls the inherited method from the Animal class.

        System.out.println("--------------------");

        // --- Runtime Polymorphism ---
        // Create a reference of the parent type (Animal) that points to a child object (Dog).
        Animal anotherAnimal = new Dog();
        System.out.print("Animal reference to a Dog object: ");
        // At runtime, the JVM determines which version of the method to call based on the object's actual type.
        // Since anotherAnimal refers to a Dog object, the makeSound() method from the Dog class is called.
        anotherAnimal.makeSound();
        anotherAnimal.eat();
    }
}
