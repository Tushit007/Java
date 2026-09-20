
import java.util.Scanner;

public class RotateArray {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        // Handle cases where k is larger than the array length
        k = k % n;

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the number of steps to rotate (k):");
        int k = scanner.nextInt();
        rotate(array, k);
        System.out.print("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
