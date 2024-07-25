import java.util.Scanner;

public class PalindromeChecker {

    /**
     * Memeriksa apakah string yang diberikan adalah palindrome.
     *
     * @param value String yang akan diperiksa.
     * @return true jika string adalah palindrome, false jika tidak.
     */
    public static boolean isPalindrome(String value) {
        // Iterasi hanya sampai setengah panjang string
        for (int i = 0; i < value.length() / 2; i++) {
            int indexAwal = i;  // Indeks dari awal string
            int indexAkhir = value.length() - i - 1;  // Indeks dari akhir string

            // Membandingkan karakter dari awal dan akhir string
            if (value.charAt(indexAwal) != value.charAt(indexAkhir)) {
                return false;  // Jika karakter tidak sama, bukan palindrome
            }
        }
        return true;  // Jika semua karakter cocok, maka string adalah palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan string
        System.out.println("Masukkan sebuah string untuk diperiksa apakah palindrome:");
        String input = scanner.nextLine();  // Membaca input string dari pengguna

        // Memeriksa apakah input adalah palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " adalah palindrome.");  // Jika ya, mencetak hasil
        } else {
            System.out.println(input + " bukan palindrome.");  // Jika tidak, mencetak hasil
        }

        scanner.close();  // Menutup scanner setelah penggunaan
    }
}
