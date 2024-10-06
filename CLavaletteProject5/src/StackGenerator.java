import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;

/**
 * Generates a sorted stack based on user input processed by InputHandler.
 * Reuses existing classes from the java.util package.
 * Leverages the Collections class for sorting the Stack.
 * Utilizes the Stack class to store data elements.
 * Reuses the Scanner class to capture input through the InputHandler class.
 * Updates existing LinkedList class to implement using a stack instead.
 */
public class StackGenerator {
    private Stack<Integer> integerStack = new Stack<>();
    private InputHandler inputHandler;
    private Scanner scanner;

    /**
     * Constructs a StackGenerator, initializing the InputHandler with a new Scanner.
     */
    public StackGenerator() {
        scanner = new Scanner(System.in);
        this.inputHandler = new InputHandler(scanner);
    }

    /**
     * Generates a sorted stack by processing the user input for the stack size and elements.
     */
    public void generateSortedStack() {
        int stackSize = inputHandler.processStackSize();
        for (int i = 1; i <= stackSize; i++) {
            int stackElement = inputHandler.processElement(i);
            integerStack.push(stackElement);
        }
        System.out.println("\nSorting stack...");
        Collections.sort(integerStack);
        System.out.println("Stack sorted successfully.");
    }

    /**
     * Prints the elements of the stack.
     */
    public void printStack() {
        System.out.println("Elements in the stack: " + integerStack);
    }

    /**
     * Closes the Scanner resource.
     */
    public void closeScanner() {
        scanner.close();
    }
}
