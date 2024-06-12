import java.util.Collections;
import java.util.Stack;

/**
 * The SortManager class handles sorting a stack of integers.
 */
public class SortManager {

    /**
     * Constructs the SortManager.
     */
    public SortManager() {
        // Default constructor.
    }
    
    /**
     * Sorts the given stack of integers in ascending order.
     * 
     * @param list the Stack of integers to be sorted
     */
    public void sortList(Stack<Integer> list) {

        // Sort the list if the list is not empty.
        if (!list.isEmpty()) {
            Collections.sort(list);
        }
    }
}