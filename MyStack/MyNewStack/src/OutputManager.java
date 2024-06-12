import java.util.Stack;

/**
 * The OutputManager class handles printing the sorted stack of integers.
 */
public class OutputManager {

    /**
     * Constructs the OutputManager.
     */
    public OutputManager() {
        // Default constructor.
    }
    
    /**
     * Prints the given stack of integers. If the stack is empty, a message is printed instead.
     * 
     * @param list the Stack of integers to be printed
     */
    public void printList(Stack<Integer> list) {

        // Check if the stack is empty before attempting to sort the stack.
        if (list.isEmpty()) {
            System.out.println("\nThere are no elements in the stack. Goodbye.");
        } else {
            System.out.println("\nHere is the sorted stack of integers: ");
            for (int value : list) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }
}