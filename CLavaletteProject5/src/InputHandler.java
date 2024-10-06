import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Handles user input for stack size and elements.
 * Ensures that the user input is valid.
 * Reuses the existing Scanner class from the java.util package for input handling.
 * Reuses InputMismatchException for error management.
 * Updates existing InputHandler class to describe a stack instead of a LinkedList.
 */
public class InputHandler {
    private Scanner sc;

    /**
     * Constructs an InputHandler with the given Scanner.
     *
     * @param scanner the Scanner to read input from
     */
    public InputHandler(Scanner scanner) {
        this.sc = scanner;
    }

    /**
     * Processes the stack size based on user input.
     * Continuously asks until a valid positive integer is provided.
     *
     * @return the size of the stack as a positive integer
     */
    public int processStackSize() {
        int stackSize = 0;
        while (true) {
            try {
                System.out.print("Enter the number of elements in the stack: ");
                stackSize = sc.nextInt();
                if (stackSize > 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer.");
                sc.nextLine();
            }
        }
        return stackSize;
    }

    /**
     * Processes each element of the stack based on user input.
     * Continuously asks until a valid integer is provided.
     *
     * @param number the number of the element being processed
     * @return the user-provided integer
     */
    public int processElement(int number) {
        int stackElement = 0;
        while (true) {
            try {
                System.out.print("Enter element " + number + ": ");
                stackElement = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer.");
                sc.nextLine();
            }
        }
        return stackElement;
    }
}
