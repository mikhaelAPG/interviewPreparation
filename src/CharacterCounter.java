import java.util.Scanner;

public class CharacterCounter {

    // Metode untuk menghitung karakter berurutan dalam sebuah string
    public static String countCharacters(String s) {
        // Jika string kosong atau null, kembalikan string kosong
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Inisialisasi variabel hasil sebagai string kosong
        String result = "";
        // Inisialisasi penghitung karakter dengan 1
        int count = 1;
        // Menyimpan karakter pertama dari string
        char previousChar = s.charAt(0);

        // Iterasi melalui setiap karakter dalam string mulai dari indeks 1
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Jika karakter saat ini sama dengan karakter sebelumnya, tingkatkan penghitung
            if (currentChar == previousChar) {
                count++;
            } else {
                // Jika karakter berbeda, tambahkan jumlah dan karakter sebelumnya ke hasil
                result += count + String.valueOf(previousChar);
                // Reset penghitung dan perbarui karakter sebelumnya
                count = 1;
                previousChar = currentChar;
            }
        }

        // Tambahkan jumlah dan karakter terakhir ke hasil
        result += count + String.valueOf(previousChar);
        return result;
    }

    // Metode utama yang dieksekusi saat program dijalankan
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel boolean untuk menentukan apakah loop harus dilanjutkan
        boolean continueLoop = true;

        // Loop untuk terus meminta input dari pengguna sampai mereka memilih untuk berhenti
        while (continueLoop) {
            System.out.print("Enter a string: ");
            String s = scanner.nextLine();
            String output = countCharacters(s);
            System.out.println("Output: " + output);

            // Menanyakan pengguna apakah mereka ingin memasukkan string lain
            System.out.print("Do you want to enter another string? (yes/no): ");
            String repeat = scanner.nextLine().trim().toLowerCase();

            // Memperbarui kondisi loop berdasarkan input pengguna
            if (repeat.equals("yes")) {
                continueLoop = true;
            } else {
                continueLoop = false;
            }
        }

        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }
}
