/**
 * The Main class is the driver for the LinkedListManager program.
 * <p>
 * --> To compile the program, use the command 'javac *.java'.
 * <p>
 * --> To run the program after compiling, use the command 'java Main'.
 * <p>
 * --> To generate javadocs, run the command 'javadoc -d docs *.java'.
 * <p>
 * --> Make sure to run the commands without quotations.
 * <p>
 * Although this program could have been written completely in one file, it has 
 * been broken down into separate components for enhanced modularity. 
 * <p> 
 * Each componenet makes use of reusable code from the Java Collection Framework, 
 * namely from the java.util package.
 * <p>
 * The primary classes and/or interfaces included in this program are:
 * <p>
 * --> LinkedList (to create a linked list)
 * <p>
 * --> Scanner (to gather user input)
 * <p>
 * --> Collections (to sort integers)
 * 
 * @author Marki Lyons
 * @version 1.0.0
 * @since Week 4 of CSC6301 
 */

public class Main {

    /**
     * Constructs Main, which runs the program.
     */
    public Main() {
        // Default constructor.
    }
    /**
     * The main method to run the LinkedListManager program.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        LinkedListManager manager = new LinkedListManager();
        manager.processList();
    }
}
