/**
 * <h2>The Main class is the driver for the StackManager program.</h2>
 * 
 * <h3>How to use the program</h3> 
 * <ul>
 * <li>To compile the program use the command: javac -d *.java</li>
 * <li>To run the program use the command: java Main.java</li>
 * <li>To create javadocs use the command: javadoc -d docs *.java</li>
 * </ul>
 * 
 * 
 * <h3>Program updates</h3>
 * Transition from linked list to stack: The program has been updated to utilize
 * a stack data structure instead of a linked list. Following is a list of the 
 * specific changes made.
 * 
 * <ol>
 * <li>
 * Main.java: The 'LinkedListManager' class has been replaced by the 
 * 'StackManager' class to reflect the new data structure.
 * </li>
 * <li>
 * UserInputManager.java: The 'LinkedList&lt;Integer&gt;' type has been changed 
 * to 'Stack&lt;Integer&gt;', ensuring that integers are collected in a stack 
 * instead of a linked list.
 * </li>
 * <li>
 * StackManager.java: Replaces the 'LinkedListManager' class. All references to 
 * 'LinkedList' have been updated to 'Stack', allowing the class to manage a 
 * stack of integers. This involves reading user input, sorting the stack, and 
 * printing the sorted values.
 * </li>
 * <li>
 * SortManager.java: The method 'sortList' now accepts a 'Stack&lt;Integer&gt;' 
 * instead of a 'LinkedList&lt;Integer&gt;'. The sorting logic continues to use 
 * the 'Collections.sort' method, which works with stacks due to their 
 * compatibility with the 'List' interface. 
 * </li>
 * <li>
 * OutputManager.java: The method 'printList' has been updated to handle a 
 * 'Stack&lt;Integer&gt;' instead of a 'LinkedList&lt;Integer&gt;'. The logic 
 * for checking if the stack is empty and printing its elements remains the same.
 * </li>
 * </ol>
 * 
 * Use of Java Utils Package and Java Collections: The program leverages the
 * Java Collections Framework to manage the stack of integers. This approach
 * emphasizes code reusability and avoids the need to reinvent basic data 
 * structures and algorithms. Key components used include:
 * <ul>
 * <li>
 * Stack: Stacks offer a last-in-first-out (LIFO) mechanism, useful for 
 * scenarios requiring this type of data access pattern.
 * </li>
 * <li>
 * Scanner: Assists in reading user input, ensuring that users can interact with
 * the program dynamically.
 * </li>
 * <li>
 * Collections.sort: Uses the sorting algorithm provided by the Java Collections
 * Framework to sort integers without the need to implement custom logic.
 * </li>
 * </ul>
 * 
 * By making use of these standard Java utilities, the program remains modular 
 * and adheres to best practices in software development. Each class is 
 * responsible for a specific task, and the overall design promotes
 * maintainability and readability.
 * 
 * @author Marki Lyons
 * @version 1.1.0
 * @since Week 5 of CSC6301 
 */

public class Main {

    /**
     * Constructs Main, which runs the program.
     */
    public Main() {
        // Default constructor.
    }
    /**
     * The main method to run the StackManager program.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        StackManager manager = new StackManager();
        manager.processList();
    }
}