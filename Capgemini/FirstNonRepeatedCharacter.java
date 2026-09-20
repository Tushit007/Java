
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static char findFirstNonRepeatedChar(String s) {
        // Map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        // First pass: Populate the frequency map
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        // Second pass: Find the first character with a count of 1
        for (char ch : s.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {  //if this code is for repeating characters the cretain if condition will change a little bit i.e [if (frequencyMap.get(ch) > 1)]
                return ch;
            }
        }
        // Return a default character or throw an exception if no unique character is found
        return '\0'; // Return null character
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeatedChar(str);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
