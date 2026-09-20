
import java.util.Scanner;

public class PythagoreanTriplets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the limit from the user
        System.out.println("Enter the limit:");
        int limit = scanner.nextInt();
        // Loop through all possible values of 'a' and 'b'
        // 'a' starts from 1
        for (int a = 1; a < limit; a++) {
            // 'b' starts from a + 1 to avoid duplicates (e.g., 3,4,5 is the same as 4,3,5)
            for (int b = a + 1; b < limit; b++) {
                // Calculate c^2
                int c_squared = a * a + b * b;
                // Calculate c
                double c = Math.sqrt(c_squared);
                // Check if 'c' is an integer and is within the limit
                if (c == (int) c && c < limit) {
                    System.out.println(a + " " + b + " " + (int) c);
                }
            }
        }
        scanner.close();
    }
}
