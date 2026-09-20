
public class StringCompressor {

    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder compressedString = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char currentChar = str.charAt(i);
            int count = 1;
            // Count consecutive occurrences of the current character
            while (i + 1 < str.length() && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            // Append the character to the result
            compressedString.append(currentChar);
            // Append the count if it's greater than 1
            if (count > 1) {
                compressedString.append(count);
            }
            i++;
        }
        return compressedString.toString();
    }

    public static void main(String[] args) {
        // Test cases from the problem statement
        String input1 = "aabbbbeeefggg";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + compressString(input1)); // Expected output: a2b4e3fg3

        String input2 = "abccccc";
        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + compressString(input2)); // Expected output: abc5
    }
}
