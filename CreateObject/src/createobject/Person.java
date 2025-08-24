package createobject;

/**
 * This class represents a Person. It's a simple blueprint for creating person objects.
 */
public class Person {
    // These are the properties or fields of the Person class.
    // They are private, which means they can only be accessed within this class.
    private int id = 1;
    private String name = "John";

    /**
     * This is a method of the Person class.
     * It displays the information of the person.
     */
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
