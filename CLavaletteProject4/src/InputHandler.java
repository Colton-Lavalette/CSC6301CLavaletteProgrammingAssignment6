import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Handles user input for list size and elements.
 * Ensures that the user input is valid.
 * Reuses the existing Scanner class from the java.util package for input handling.
 * Reuses InputMismatchException for error management.
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
     * Processes the list size based on user input.
     * Continuously asks until a valid positive integer is provided.
     *
     * @return the size of the list as a positive integer
     */
    public int processListSize() {
        int listSize = 0;
        while (true) {
            try {
                System.out.print("Enter the number of elements in the list: ");
                listSize = sc.nextInt();
                if (listSize > 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer.");
                sc.nextLine();
            }
        }
        return listSize;
    }

    /**
     * Processes each element of the list based on user input.
     * Continuously asks until a valid integer is provided.
     *
     * @param number the number of the element being processed
     * @return the user-provided integer
     */
    public int processElement(int number) {
        int listElement = 0;
        while (true) {
            try {
                System.out.print("Enter element " + number + ": ");
                listElement = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer.");
                sc.nextLine();
            }
        }
        return listElement;
    }
}
