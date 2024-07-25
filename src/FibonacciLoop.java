public class FibonacciLoop {

    // Metode utama yang dieksekusi saat program dijalankan
    public static void main(String[] args) {
        // Menentukan jumlah elemen dalam deret Fibonacci
        int numTerms = 0;

        // Memeriksa apakah jumlah elemen lebih besar dari 0
        if (numTerms <= 0) {
            // Jika tidak, cetak pesan peringatan
            System.out.println("Masukkan angka yang lebih besar dari 0");
        } else {
            // Inisialisasi dua angka pertama dalam deret Fibonacci
            int a = 0;
            int b = 1;

            // Membuat array untuk menyimpan deret Fibonacci
            int[] fibSequence = new int[numTerms];

            // Mengisi array dengan deret Fibonacci
            for (int i = 0; i < numTerms; i++) {
                // Menyimpan nilai Fibonacci saat ini di array
                fibSequence[i] = a;

                // Menghitung nilai Fibonacci berikutnya
                int temp = a + b;
                a = b;
                b = temp;
            }

            // Mencetak deret Fibonacci
            System.out.print("Deret Fibonacci dengan " + numTerms + " bilangan: ");
            for (int num : fibSequence) {
                System.out.print(num + " ");
            }
        }
    }
}
