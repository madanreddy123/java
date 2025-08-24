package parameterizedconstructor;

/**
 * This class demonstrates the use of parameterized constructors and constructor overloading.
 */
public class ParameterizedConstructorDemo {

    public static void main(String[] args) {
        System.out.println("--- Creating a student with the default constructor ---");
        Student student1 = new Student();
        student1.displayDetails();

        System.out.println("\n--- Creating a student with the name constructor ---");
        Student student2 = new Student("Alice");
        student2.displayDetails();

        System.out.println("\n--- Creating a student with the full constructor ---");
        Student student3 = new Student(101, "Bob", "Computer Science");
        student3.displayDetails();
    }
}
