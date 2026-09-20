
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals by their start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]); // Add the first interval

        // Step 2: Iterate and merge
        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

            // If the current interval overlaps with the last merged one
            if (currentInterval[0] <= lastMerged[1]) {
                // Update the end of the last merged interval
                lastMerged[1] = Math.max(lastMerged[1], currentInterval[1]);
            } else {
                // No overlap, add the current interval
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(intervals);

        System.out.print("Merged Intervals: [");
        for (int i = 0; i < mergedIntervals.length; i++) {
            System.out.print(Arrays.toString(mergedIntervals[i]));
            if (i < mergedIntervals.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
