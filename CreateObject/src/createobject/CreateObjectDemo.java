package createobject;

/**
 * This class demonstrates how to create and use an object.
 */
public class CreateObjectDemo {

    public static void main(String[] args) {
        // This is how you create an object (an instance) of the Person class.
        // 'new Person()' calls the constructor of the Person class and allocates memory for the object.
        // 'person1' is a reference variable that holds the memory address of the created object.
        Person person1 = new Person();

        // Once the object is created, you can call its methods using the dot (.) operator.
        System.out.println("Displaying info for person1:");
        person1.displayInfo();
    }
}
