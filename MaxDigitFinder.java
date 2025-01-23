// //2.Write a program to input a 10 digit number and find the digit with maximum value.

import java.util.Scanner;
public class MaxDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10-digit number: ");
        long number = scanner.nextLong();
        if (number < 1000000000L || number > 9999999999L) {
            System.out.println("Please enter a valid 10-digit number.");
            return;
        }
        int maxDigit = 0;
        while (number > 0) {
            int digit = (int) (number % 10);
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        System.out.println("The digit with the maximum value is: " + maxDigit);
    }
}
