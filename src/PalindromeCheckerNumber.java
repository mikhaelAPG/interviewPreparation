import java.util.Scanner;

public class PalindromeCheckerNumber {

    // Function to check if a number is a palindrome
    public static boolean isPalindromeNumber(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }

        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the input number is a palindrome
        if (isPalindromeNumber(num)) {
            System.out.println("The number is a palindrome!");
        } else {
            System.out.println("The number is not a palindrome!");
        }

        scanner.close();
    }
}
