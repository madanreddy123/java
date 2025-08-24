package parameterizedconstructor;

/**
 * This class represents a Student and demonstrates constructor overloading.
 */
public class Student {
    private int studentId;
    private String name;
    private String major;

    /**
     * This is a default constructor. It initializes the object with default values.
     */
    public Student() {
        // We can use 'this(...)' to call another constructor in the same class.
        // This is called constructor chaining and helps to avoid code duplication.
        this(-1, "Unknown", "Undeclared");
        System.out.println("Default constructor called.");
    }

    /**
     * This is a parameterized constructor with one parameter.
     * @param name The name of the student.
     */
    public Student(String name) {
        this(-1, name, "Undeclared");
        System.out.println("Constructor with name parameter called.");
    }

    /**
     * This is a parameterized constructor with three parameters.
     * The 'this' keyword is used to distinguish between the instance variables
     * and the parameters with the same name.
     * @param studentId The ID of the student.
     * @param name The name of the student.
     * @param major The major of the student.
     */
    public Student(int studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        System.out.println("Constructor with all parameters called.");
    }

    /**
     * This method displays the details of the student.
     */
    public void displayDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("ID: " + this.studentId);
        System.out.println("Name: " + this.name);
        System.out.println("Major: " + this.major);
        System.out.println("-----------------------");
    }
}
