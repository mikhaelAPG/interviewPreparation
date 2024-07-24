import java.util.Scanner;

public class Calculator {

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static String divide(double x, double y) {
        if (y == 0) {
            return "Error! Division by zero.";
        } else {
            return String.valueOf(x / y);
        }
    }

    public static void menu() {
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
    }

    public static String getChoice(Scanner scanner) {
        System.out.print("Enter choice (1, 2, 3, 4): ");
        String choice = scanner.nextLine();
        if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
            return choice;
        } else {
            return null;
        }
    }

    public static double[] getNumbers(Scanner scanner) {
        double[] numbers = new double[2];
        try {
            System.out.print("Enter first number: ");
            numbers[0] = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter second number: ");
            numbers[1] = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            return null;
        }
        return numbers;
    }

    public static String performCalculation(String choice, double num1, double num2) {
        switch (choice) {
            case "1":
                return num1 + " + " + num2 + " = " + add(num1, num2);
            case "2":
                return num1 + " - " + num2 + " = " + subtract(num1, num2);
            case "3":
                return num1 + " * " + num2 + " = " + multiply(num1, num2);
            case "4":
                String result = divide(num1, num2);
                if (result.equals("Error! Division by zero.")) {
                    return result;
                } else {
                    return num1 + " / " + num2 + " = " + result;
                }
            default:
                return "Invalid choice";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        while (status) {
            menu();
            String choice = getChoice(scanner);
            if (choice != null) {
                double[] numbers = getNumbers(scanner);
                if (numbers != null) {
                    String result = performCalculation(choice, numbers[0], numbers[1]);
                    System.out.println(result);
                    System.out.print("Do you want to perform another calculation? (yes/no): ");
                    String nextCalculation = scanner.nextLine();
                    if (nextCalculation.equalsIgnoreCase("no")) {
                        status = false;
                    }
                }
            } else {
                System.out.println("Invalid choice. Please select a valid operation.");
            }
        }

        scanner.close();
    }
}
