import java.util.LinkedList;

/**
 * The LinkedListManager class manages the process of reading, sorting, and
 * printing a list of integers.
 */
public class LinkedListManager {
    
    private LinkedList<Integer> myList;
    private UserInputManager inputManager;
    private SortManager sortManager;
    private OutputManager outputManager;

    /**
     * Constructs a LinkedListManager and initializes the components.
     */
    public LinkedListManager() {
        myList = new LinkedList<>();
        inputManager = new UserInputManager();
        sortManager = new SortManager();
        outputManager = new OutputManager();
    }

    /** 
     * Processes the list by reading and sorting integers, then printing the 
     * sorted list.
     */
    public void processList() {
        myList = inputManager.readIntegers();
        sortManager.sortList(myList);
        outputManager.printList(myList);
    }
}
