/**
 * This class demonstrates the use of abstract classes and polymorphism.
 */
public class AbstractDemo {

    public static void main(String[] args) {
        // Create an instance of the Dog class.
        // We can refer to it using a variable of the abstract type Animal.
        // This is an example of polymorphism.
        Animal myDog = new Dog();

        // Call the concrete methods from the Animal class.
        myDog.eat();
        myDog.sleep();

        // Call the abstract method that is implemented in the Dog class.
        myDog.makeSound();
    }
}
