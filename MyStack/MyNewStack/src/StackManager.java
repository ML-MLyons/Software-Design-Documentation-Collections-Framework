import java.util.Stack;

/**
 * The StackManager class manages the process of reading, sorting, and
 * printing a stack of integers.
 */
public class StackManager {

    private Stack<Integer> myStack;
    private UserInputManager inputManager;
    private SortManager sortManager;
    private OutputManager outputManager;

    /**
     * Constructs a StackManager and initializes the components.
     */
    public StackManager() {
        myStack = new Stack<>();
        inputManager = new UserInputManager();
        sortManager = new SortManager();
        outputManager = new OutputManager();
    }

    /** 
     * Processes the stack by reading and sorting integers, then printing the 
     * sorted stack.
     */
    public void processList() {
        myStack = inputManager.readIntegers();
        sortManager.sortList(myStack);
        outputManager.printList(myStack);
    }

}