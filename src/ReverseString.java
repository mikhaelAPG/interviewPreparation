import java.util.Scanner;

public class ReverseString {

    // Metode untuk membalikkan string
    public static String reverseString(String s) {
        // Inisialisasi string untuk menyimpan hasil pembalikan
        String reversedS = "";

        // Iterasi melalui setiap karakter dalam string dari indeks 0 hingga panjang string - 1
        for (int i = 0; i < s.length(); i++) {
            // Menambahkan karakter saat ini di depan string hasil pembalikan
            reversedS = s.charAt(i) + reversedS;
        }

        // Mengembalikan string yang telah dibalik
        return reversedS;
    }

    // Metode utama yang dieksekusi saat program dijalankan
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan string yang ingin dibalik
        System.out.print("Enter a string to reverse: ");
        String s = scanner.nextLine();

        // Memanggil metode reverseString untuk membalikkan string
        String reversedS = reverseString(s);

        // Menampilkan string yang telah dibalik ke konsol
        System.out.println("Reversed string: " + reversedS);

        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }
}
