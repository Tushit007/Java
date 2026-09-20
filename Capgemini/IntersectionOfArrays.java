
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] intersection = findIntersection(arr1, arr2);
        System.out.print("Intersection: [");

        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i]);
            if (i < intersection.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Use a set to store unique elements of arr1
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // Use a list to store the intersection elements
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2) {
            // Check if the element from arr2 exists in set1
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }

        return result;
    }
}
