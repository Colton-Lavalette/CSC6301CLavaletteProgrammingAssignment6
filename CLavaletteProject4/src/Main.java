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
        LinkedListGenerator linkedListGenerator = new LinkedListGenerator();
        linkedListGenerator.generateSortedLinkedList();
        System.out.println();
        linkedListGenerator.printLinkedList();
        linkedListGenerator.closeScanner(); // Close the Scanner resource
    }
}
