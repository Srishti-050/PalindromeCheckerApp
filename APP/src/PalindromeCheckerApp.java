/**
 * =========================================================
 * MAIN CLASS - UseCase9RecursivePalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using recursion. It compares characters from the
 * beginning and end recursively until the base condition.
 *
 * Data Structure: Call Stack
 *
 * @author Srishti Singh
 * @version 9.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Recursive method to check palindrome
     */
    public static boolean isPalindrome(String input, int left, int right) {

        // Base condition: If pointers cross, string is palindrome
        if (left >= right) {
            return true;
        }

        // If mismatch found
        if (input.charAt(left) != input.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(input, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}