
import java.util.Scanner;

public class MajorityElement {

    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        // First pass: Find the candidate for the majority element
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // No need for a second pass as the problem guarantees a majority element.
        return candidate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int majority = findMajorityElement(array);

        System.out.println("The majority element is: " + majority);

        scanner.close();
    }
}
