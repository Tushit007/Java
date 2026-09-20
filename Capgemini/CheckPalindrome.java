
class CheckPalindrome {

    public static boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String str = "racecar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
