import java.util.Scanner;

public class PalindromeCheckerNumber {

    // Function to check if a number is a palindrome
    public static boolean isPalindromeNumber(int num) {
        // Menyimpan nilai awal dari num untuk perbandingan nanti
        int temp = num;
        // Inisialisasi variabel untuk menyimpan angka yang dibalik
        int rev = 0;

        // Proses untuk membalikkan angka
        while (num > 0) {
            // Mendapatkan digit terakhir dari angka
            int dig = num % 10;
            // Menambahkan digit terakhir ke variabel rev dengan menggeser digit yang ada ke kiri
            rev = rev * 10 + dig;
            // Menghapus digit terakhir dari angka
            num = num / 10;
        }

        // Membandingkan angka asli dengan angka yang telah dibalik
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
