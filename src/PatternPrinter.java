import java.util.Scanner;

public class PatternPrinter {

    /**
     * Mencetak pola berdasarkan nilai input n.
     *
     * @param n Nilai input yang menentukan ukuran pola
     */
    public static void printPattern(int n) {
        // Loop untuk setiap baris pola
        for (int i = 1; i <= n; i++) {
            int j = 1;
            // Loop untuk setiap karakter dalam baris
            while (j <= n + 3) {
                // Mencetak angka
                System.out.print(j);
                // Jika posisi j sama dengan i, cetak '**'
                if (i == j) {
                    System.out.print("**");
                    // Menambahkan 2 pada j untuk melewati karakter '**'
                    j += 2;
                }
                j++;
            }
            // Pindah ke baris berikutnya setelah selesai mencetak baris saat ini
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        // Meminta input nilai n dari pengguna
        System.out.print("input n: ");
        int n = scanner.nextInt();
        // Memanggil metode untuk mencetak pola berdasarkan nilai n
        printPattern(n);
    }
}
