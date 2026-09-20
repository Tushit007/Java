
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of elements (not used in this solution's logic, but good practice to read)
        int n = scanner.nextInt();
        // Use a HashMap to store the frequency of each integer
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Read integers and count their occurrences
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        // Print the frequency of each integer
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
        scanner.close();
    }
}
