package access_specifier;

/**
 * This class demonstrates the difference between static and non-static (instance) members.
 */
public class StaticVsNonStatic {

    // --- Static Members ---
    // A static variable belongs to the class itself, not to any specific instance.
    // There is only one copy of a static variable, shared by all instances of the class.
    public static int staticCounter = 0;

    // A static method also belongs to the class.
    // It can be called directly on the class without creating an instance.
    // Static methods can only access other static members directly.
    public static void incrementStaticCounter() {
        System.out.println("Accessing static method.");
        staticCounter++;
        System.out.println("Static counter is now: " + staticCounter);
    }


    // --- Non-Static (Instance) Members ---
    // A non-static (or instance) variable belongs to a specific instance of the class.
    // Each object has its own copy of instance variables.
    public String instanceName;

    /**
     * This is the constructor for the class.
     * It initializes the instance variable 'instanceName'.
     * @param name The name for this instance.
     */
    public StaticVsNonStatic(String name) {
        this.instanceName = name;
        System.out.println("Instance created with name: " + this.instanceName);
    }

    // A non-static method belongs to an instance of the class.
    // It must be called on a specific object.
    // Non-static methods can access both static and non-static members.
    public void displayInfo() {
        System.out.println("--- Displaying info for instance: " + this.instanceName + " ---");
        System.out.println("Accessing instance variable 'instanceName': " + this.instanceName);
        System.out.println("Accessing static variable 'staticCounter' from a non-static method: " + staticCounter);
        System.out.println("--- Finished displaying info ---");
    }

    public static void main(String[] args) {
        System.out.println("### Demonstrating Static Members ###");
        // We can access static members directly through the class, without creating an instance.
        System.out.println("Initial value of staticCounter: " + StaticVsNonStatic.staticCounter);
        StaticVsNonStatic.incrementStaticCounter();
        StaticVsNonStatic.incrementStaticCounter();
        System.out.println("Final value of staticCounter: " + StaticVsNonStatic.staticCounter);

        System.out.println("\n### Demonstrating Non-Static Members ###");
        // To access non-static members, we must create an instance (an object) of the class.
        System.out.println("Creating first instance...");
        StaticVsNonStatic instance1 = new StaticVsNonStatic("Instance-1");
        instance1.displayInfo();

        System.out.println("\nCreating second instance...");
        StaticVsNonStatic instance2 = new StaticVsNonStatic("Instance-2");
        instance2.displayInfo();

        // Note that the staticCounter is shared between all instances.
        System.out.println("\nCalling static method from an instance (not recommended, but possible):");
        instance1.incrementStaticCounter(); // This will still increment the single static counter.
        System.out.println("Value of staticCounter after calling from instance1: " + staticCounter);
        System.out.println("Value of staticCounter for instance2 is the same: " + instance2.staticCounter);
    }
}
