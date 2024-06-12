import java.util.Collections;
import java.util.LinkedList;

/**
 * The SortManager class handles sorting a list of integers.
 */
public class SortManager {

    /**
     * Constructs the SortManager.
     */
    public SortManager() {
        // Default constructor.
    }
    
    /**
     * Sorts the given list of integers in ascending order.
     * 
     * @param list the LinkedList of integers to be sorted
     */
    public void sortList(LinkedList<Integer> list) {

        // Sort the list if the list is not empty.
        if (!list.isEmpty()) {
            Collections.sort(list);
        }
    }
}
