/**
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by ignoring spaces and case differences.
 *
 * Data Structure: String / Array
 *
 * @author Srishti Singh
 * @version 10.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // 1️⃣ Normalize string
        // Convert to lowercase
        input = input.toLowerCase();

        // Remove all spaces using regex
        input = input.replaceAll("\\s+", "");

        int left = 0;
        int right = input.length() - 1;

        // 2️⃣ Apply previous two-pointer logic
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}