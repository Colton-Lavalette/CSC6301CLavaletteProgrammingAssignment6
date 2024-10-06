import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Generates a sorted linked list based on user input processed by InputHandler.
 * Reuses existing classes from the java.util package.
 * Leverages the Collections class for sorting the LinkedList.
 * Utilizes the LinkedList class to store data elements.
 * Reuses the Scanner class to capture input through the InputHandler class.
 */
public class LinkedListGenerator {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    private InputHandler inputHandler;
    private Scanner scanner;

    /**
     * Constructs a LinkedListGenerator, initializing the InputHandler with a new Scanner.
     */
    public LinkedListGenerator() {
        scanner = new Scanner(System.in);
        this.inputHandler = new InputHandler(scanner);
    }

    /**
     * Generates a sorted linked list by processing the user input for the list size and elements.
     */
    public void generateSortedLinkedList() {
        int linkedListSize = inputHandler.processListSize();
        for (int i = 1; i <= linkedListSize; i++) {
            int listElement = inputHandler.processElement(i);
            linkedList.add(listElement);
        }
        System.out.println("\nSorting linked list...");
        Collections.sort(linkedList);
        System.out.println("Linked list sorted successfully.");
    }

    /**
     * Prints the elements of the linked list.
     */
    public void printLinkedList() {
        System.out.println("Elements in the linked list: " + linkedList);
    }

    /**
     * Closes the Scanner resource.
     */
    public void closeScanner() {
        scanner.close();
    }
}
