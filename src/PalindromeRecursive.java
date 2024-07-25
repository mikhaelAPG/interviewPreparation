import java.util.Scanner;

public class PalindromeRecursive {

    /**
     * Metode rekursif untuk memeriksa apakah sebuah string adalah palindrome.
     *
     * @param value String yang akan diperiksa.
     * @param i Indeks karakter saat ini yang diperiksa.
     * @return true jika string adalah palindrome, false jika tidak.
     */
    private boolean isPalindromeRecursive(String value, int i) {
        // Jika indeks saat ini lebih kecil dari setengah panjang string
        if (i < value.length() / 2) {
            // Bandingkan karakter dari awal dan akhir string
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                return false;  // Jika karakter tidak sama, bukan palindrome
            } else {
                // Rekursi dengan indeks berikutnya
                return isPalindromeRecursive(value, i + 1);
            }
        } else {
            // Jika semua karakter cocok, maka string adalah palindrome
            return true;
        }
    }

    /**
     * Fungsi publik untuk memanggil metode rekursif dari luar kelas.
     *
     * @param value String yang akan diperiksa.
     * @return true jika string adalah palindrome, false jika tidak.
     */
    public boolean isPalindrome(String value) {
        return isPalindromeRecursive(value, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan string
        System.out.println("Masukkan sebuah string untuk diperiksa apakah palindrome:");
        String input = scanner.nextLine();  // Membaca input string dari pengguna

        PalindromeRecursive checker = new PalindromeRecursive();  // Membuat objek PalindromeRecursive

        // Memeriksa apakah input adalah palindrome
        if (checker.isPalindrome(input)) {
            System.out.println(input + " adalah palindrome.");  // Jika ya, mencetak hasil
        } else {
            System.out.println(input + " bukan palindrome.");  // Jika tidak, mencetak hasil
        }

        scanner.close();  // Menutup scanner setelah penggunaan
    }
}
