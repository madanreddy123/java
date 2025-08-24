package defaultconstructor;

/**
 * This class demonstrates how to create an object using a default constructor.
 */
public class DefaultConstructorDemo {

    public static void main(String[] args) {
        // When we use 'new Book()', we are calling the default constructor of the Book class.
        // This creates a new Book object and initializes its properties as defined in the constructor.
        Book myBook = new Book();

        System.out.println("\nDisplaying the details of the newly created book:");
        // Now we can call methods on the created object.
        myBook.displayDetails();
    }
}
