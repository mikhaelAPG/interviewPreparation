import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isAlphanumeric(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    public static char toLower(char ch) {
        return Character.toLowerCase(ch);
    }

    public static boolean isPalindrome(String s) {
        // Initialize pointers
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !isAlphanumeric(s.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous alphanumeric character
            while (left < right && !isAlphanumeric(s.charAt(right))) {
                right--;
            }

            // Compare characters in a case-insensitive manner
            if (toLower(s.charAt(left)) != toLower(s.charAt(right))) {
                return false;
            }

            // Move towards the center
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string to check if it's a palindrome: ");
        String s = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(s)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
