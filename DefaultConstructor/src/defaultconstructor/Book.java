package defaultconstructor;

/**
 * This class represents a Book and demonstrates a user-defined default constructor.
 */
public class Book {
    private String title;
    private String author;

    /**
     * This is a user-defined default constructor.
     * A constructor is a special method that is called when an object is created.
     * A default constructor is a constructor that takes no arguments.
     *
     * If you do not define any constructor in your class, the Java compiler
     * provides a default constructor for you automatically. It will initialize
     * member variables to their default values (e.g., null for objects, 0 for int).
     *
     * However, if you define any constructor (like a parameterized one), the compiler
     * will not provide a default one.
     *
     * This constructor initializes the book with some default values.
     */
    public Book() {
        System.out.println("A new Book object is being created using the default constructor...");
        this.title = "Untitled";
        this.author = "Unknown";
    }

    /**
     * This method displays the details of the book.
     */
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}
