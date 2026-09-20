
import java.util.Scanner;

public class MinDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of items
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String minDiscountItem = "";
        double minDiscountPercentage = 101.0; // Initialize with a value higher than any possible discount
        // Loop through each item
        for (int i = 0; i < n; i++) {
            String itemDetails = scanner.nextLine();
            String[] parts = itemDetails.split(",");
            // Parse the item details
            String itemName = parts[0];
            // double itemPrice = Double.parseDouble(parts[1]); // Price is not needed for this problem
            double discountPercentage = Double.parseDouble(parts[2]);
            // Check if the current item's discount is the new minimum
            if (discountPercentage < minDiscountPercentage) {
                minDiscountPercentage = discountPercentage;
                minDiscountItem = itemName;
            }
        }
        // Print the item with the minimum discount
        System.out.println(minDiscountItem);
        scanner.close();
    }
}
