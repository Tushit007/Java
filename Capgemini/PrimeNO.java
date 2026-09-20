
import java.util.Scanner;

public class PrimeNO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check for primality:");
        int number = scanner.nextInt();

        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        // Prime numbers must be greater than 1
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so it's not a prime number
            }
        }

        return true; // No divisors found, so it's a prime number
    }
}
