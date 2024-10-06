/**
 * Main class to run the linked list generation application.
 */
public class Main {

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        StackGenerator stackGenerator = new StackGenerator();
        stackGenerator.generateSortedStack();
        System.out.println();
        stackGenerator.printStack();
        stackGenerator.closeScanner(); // Close the Scanner resource
    }
}
