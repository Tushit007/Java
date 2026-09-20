
import java.util.Scanner;

public class MaxMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of semesters
        System.out.println("Enter no of semester:");
        int numSemesters = scanner.nextInt();
        // Loop through each semester
        for (int i = 1; i <= numSemesters; i++) {
            System.out.println("Enter no of subjects in " + i + " semester:");
            int numSubjects = scanner.nextInt();

            int maxMark = -1; // Initialize maxMark for the current semester

            // Loop through each subject in the current semester
            for (int j = 1; j <= numSubjects; j++) {
                int mark = scanner.nextInt();

                // Validate the mark
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    // The problem statement implies exiting on an invalid mark.
                    // This is a simple way to handle it.
                    return;
                }

                // Update the maximum mark if the current mark is higher
                if (mark > maxMark) {
                    maxMark = mark;
                }
            }

            // Print the maximum mark for the current semester
            System.out.println("Maximum mark in " + i + " semester:" + maxMark);
        }

        scanner.close();
    }
}
