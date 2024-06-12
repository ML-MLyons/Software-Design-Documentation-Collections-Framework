import java.util.Scanner;
import java.util.Stack;

/**
 * The UserInputManager class handles reading a series of integers input by the 
 * user.
 */

public class UserInputManager {
    
    /**
     * Constructs the UserInputManager.
     */
    public UserInputManager() {
        // Default constructor.
    }

    /**
     * Reads integers from the user until 'q' is entered.
     * 
     * @return a Stack containing the entered integers
     */    
    public Stack<Integer> readIntegers() {

        Stack<Integer> list = new Stack<>();
        System.out.println("\nPlease enter a series of integers. Type 'q' to quit when done: ");

        // Use try-with-resources to ensure scanner closes.
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    list.add(scanner.nextInt()); 
                } else {
                    String input = scanner.next();
                    if (input.equals("q")) {
                        break;
                    } else {
                        System.out.println("\nPlease enter a valid integer or 'q' to quit: ");
                    }
                }
            }
        }

        return list;
    }
}