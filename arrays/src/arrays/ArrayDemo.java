package arrays;

/**
 * This class demonstrates the basics of using arrays in Java.
 */
public class ArrayDemo {

    public static void main(String[] args) {
        // --- Declaring and Initializing an Array ---
        // An array is a collection of elements of the same type.

        // Declare an array of integers.
        int[] numbers;

        // Initialize the array to hold 5 integers.
        // The elements are automatically initialized to their default value (0 for int).
        numbers = new int[5];

        // We can also declare and initialize in one line.
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};


        // --- Accessing Array Elements ---
        // We access elements using their index, which starts at 0.
        System.out.println("### Accessing Array Elements ###");
        System.out.println("The first fruit is: " + fruits[0]);
        System.out.println("The third fruit is: " + fruits[2]);

        // We can also change the value of an element.
        System.out.println("\nChanging the value of the first element...");
        fruits[0] = "Strawberry";
        System.out.println("The first fruit is now: " + fruits[0]);


        // --- Array Length ---
        // The .length property gives the number of elements in the array.
        System.out.println("\n### Array Length ###");
        System.out.println("The 'fruits' array has " + fruits.length + " elements.");
        System.out.println("The 'numbers' array has " + numbers.length + " elements.");


        // --- Iterating Through an Array ---
        // We can use a for loop to visit each element in the array.
        System.out.println("\n### Iterating with a for loop ###");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }

        // A "for-each" loop is often a simpler way to iterate.
        System.out.println("\n### Iterating with a for-each loop ###");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }


        // --- Example: Populating and printing the 'numbers' array ---
        System.out.println("\n### Populating and Printing the 'numbers' array ###");
        // Let's fill the numbers array with some values.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 10; // Put values 10, 20, 30, 40, 50 in the array
        }

        // Now let's print them out.
        System.out.print("The numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // for a new line
    }
}
