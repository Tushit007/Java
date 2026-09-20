
import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of steps (this input is not strictly needed for the logic,
        // but it's part of the problem statement's input format)
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        // Read the sequence of steps
        String path = scanner.nextLine();
        int level = 0; // Current altitude, starting at sea level
        int valleys = 0; // Number of valleys traversed
        for (int i = 0; i < n; i++) {
            char step = path.charAt(i);
            // If the step is a 'U' (Up)
            if (step == 'U') {
                level++;
                // Check if we just came out of a valley
                if (level == 0) {
                    valleys++;
                }
            } else if (step == 'D') { // If the step is a 'D' (Down)
                level--;
            }
        }
        System.out.println(valleys);
        scanner.close();
    }
}
