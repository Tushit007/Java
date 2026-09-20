
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Set<Integer> duplicates = findAllDuplicates(nums);

        System.out.print("Duplicates: " + duplicates);
    }

    public static Set<Integer> findAllDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            // The add() method returns false if the element is already present
            if (!seen.add(num)) {
                // If it's already in the 'seen' set, it's a duplicate
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
