import java.util.Scanner;

public class Factorial {

    // Metode iteratif untuk menghitung faktorial
    public static long factorialIterative(int n) {
        // Menangani kasus di mana n kurang dari 0 dengan mengembalikan -1 sebagai indikator kesalahan
        if (n < 0) {
            return -1;
        }

        // Inisialisasi hasil faktorial dengan 1
        long result = 1;

        // Mengalikan semua bilangan dari 1 hingga n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // Metode rekursif untuk menghitung faktorial
    public static long factorialRecursive(int n) {
        // Menangani kasus dasar di mana n adalah 0 atau 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Menangani kasus di mana n kurang dari 0 dengan mengembalikan -1 sebagai indikator kesalahan
        if (n < 0) {
            return -1;
        }

        // Rekursi untuk menghitung faktorial n
        return n * factorialRecursive(n - 1);
    }

    // Metode utama yang dieksekusi saat program dijalankan
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan angka
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Menghitung faktorial menggunakan metode iteratif
        long iterativeResult = factorialIterative(number);
        if (iterativeResult == -1) {
            System.out.println("Error: Number must be non-negative.");
        } else {
            System.out.println("Factorial (iterative) of " + number + " is: " + iterativeResult);
        }

        // Menghitung faktorial menggunakan metode rekursif
        long recursiveResult = factorialRecursive(number);
        if (recursiveResult == -1) {
            System.out.println("Error: Number must be non-negative.");
        } else {
            System.out.println("Factorial (recursive) of " + number + " is: " + recursiveResult);
        }

        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }
}
