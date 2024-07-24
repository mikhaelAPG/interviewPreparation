import java.util.Scanner;

public class CharacterCounter {

    public static String countCharacters(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String result = "";
        int count = 1;
        char previousChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == previousChar) {
                count++;
            } else {
                result += count + String.valueOf(previousChar);
                count = 1;
                previousChar = currentChar;
            }
        }

        result += count + String.valueOf(previousChar);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string: ");
            String s = scanner.nextLine();
            String output = countCharacters(s);
            System.out.println("Output: " + output);

            System.out.print("Do you want to enter another string? (yes/no): ");
            String repeat = scanner.nextLine().trim().toLowerCase();
            if (!repeat.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
