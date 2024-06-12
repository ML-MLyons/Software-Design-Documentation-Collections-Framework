import java.util.LinkedList;
import java.util.Scanner;

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
     * @return a LinkedList containing the entered integers
     */    
    public LinkedList<Integer> readIntegers() {

        LinkedList<Integer> list = new LinkedList<>();
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
