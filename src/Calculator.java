import java.util.Scanner;

public class Calculator {

    // Metode untuk menambahkan dua angka
    public static double add(double x, double y) {
        return x + y;
    }

    // Metode untuk mengurangi dua angka
    public static double subtract(double x, double y) {
        return x - y;
    }

    // Metode untuk mengalikan dua angka
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Metode untuk membagi dua angka
    // Mengembalikan hasil pembagian sebagai String untuk menangani kasus pembagian dengan nol
    public static String divide(double x, double y) {
        if (y == 0) {
            return "Error! Division by zero.";
        } else {
            return String.valueOf(x / y);
        }
    }

    // Menampilkan menu operasi kalkulator
    public static void menu() {
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
    }

    // Mendapatkan pilihan operasi dari pengguna
    public static String getChoice(Scanner scanner) {
        System.out.print("Enter choice (1, 2, 3, 4): ");
        String choice = scanner.nextLine();
        // Memeriksa apakah pilihan valid
        if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
            return choice;
        } else {
            return null;
        }
    }

    // Mendapatkan dua angka dari pengguna
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

    // Melakukan perhitungan berdasarkan pilihan pengguna
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

    // Metode utama yang dieksekusi saat program dijalankan
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        // Loop untuk memungkinkan pengguna melakukan beberapa perhitungan
        while (status) {
            menu(); // Menampilkan menu operasi kalkulator
            String choice = getChoice(scanner); // Mendapatkan pilihan dari pengguna
            if (choice != null) {
                double[] numbers = getNumbers(scanner); // Mendapatkan dua angka dari pengguna
                if (numbers != null) {
                    String result = performCalculation(choice, numbers[0], numbers[1]); // Melakukan perhitungan
                    System.out.println(result); // Menampilkan hasil
                    System.out.print("Do you want to perform another calculation? (yes/no): ");
                    String nextCalculation = scanner.nextLine();
                    // Memeriksa apakah pengguna ingin melakukan perhitungan lain
                    if (nextCalculation.equalsIgnoreCase("no")) {
                        status = false;
                    }
                }
            } else {
                System.out.println("Invalid choice. Please select a valid operation.");
            }
        }

        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }
}
