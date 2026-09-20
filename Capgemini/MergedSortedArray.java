
public class MergedSortedArray {

    public static int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArray = new int[m + n];

        int p1 = 0; // Pointer for arr1
        int p2 = 0; // Pointer for arr2
        int p3 = 0; // Pointer for the merged array
        // Compare elements and add the smaller one to the merged array
        while (p1 < m && p2 < n) {
            if (arr1[p1] <= arr2[p2]) {
                mergedArray[p3++] = arr1[p1++];
            } else {
                mergedArray[p3++] = arr2[p2++];
            }
        }

        // Add remaining elements from arr1 (if any)
        while (p1 < m) {
            mergedArray[p3++] = arr1[p1++];
        }

        // Add remaining elements from arr2 (if any)
        while (p2 < n) {
            mergedArray[p3++] = arr2[p2++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] mergedResult = merge(array1, array2);

        System.out.print("Merged Array: ");
        for (int num : mergedResult) {
            System.out.print(num + " ");
        }
    }
}
