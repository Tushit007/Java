public class Ispalindrome {
    public static boolean Palindrome(int n){
        int x=n;
        int rev=0;
        while (x!=0) {
            int rem=x%10;
            rev=rev*10 +rem;
            x=x/10;
        }
        if(n==rev){
            return true;
        }
        else{
            return false;
        }
       
    }
    public static void main(String[] args) {
        System.out.println(Palindrome(10001));
        
    }
    
}
