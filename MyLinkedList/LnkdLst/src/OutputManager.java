import java.util.LinkedList;

/**
 * The OutputManager class handles printing the sorted list of integers.
 */
public class OutputManager {

    /**
     * Constructs the OutputManager.
     */
    public OutputManager() {
        // Default constructor.
    }
    
    /**
     * Prints the given list of integers. If the list is empty, a message is printed instead.
     * 
     * @param list the LinkedList of integers to be printed
     */
    public void printList(LinkedList<Integer> list) {

        // Check if the list is empty before attempting to sort the list.
        if (list.isEmpty()) {
            System.out.println("\nThere are no elements in the list. Goodbye.");
        } else {
            System.out.println("\nHere is the sorted list of integers: ");
            for (int value : list) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }
}
