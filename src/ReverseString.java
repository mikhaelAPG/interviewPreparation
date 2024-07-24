import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String s) {
        String reversedS = "";
        for (int i = 0; i < s.length(); i++) {
            reversedS = s.charAt(i) + reversedS;
        }
        return reversedS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String s = scanner.nextLine();
        String reversedS = reverseString(s);
        System.out.println("Reversed string: " + reversedS);

        scanner.close();
    }
}
