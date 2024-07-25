public class FibonacciRecursive {

    // Metode untuk menghitung nilai Fibonacci secara rekursif
    public static int fibonacciRecursive(int n) {
        // Jika n kurang dari atau sama dengan 0, kembalikan 0
        if (n <= 0) {
            return 0;
            // Jika n sama dengan 1, kembalikan 1
        } else if (n == 1) {
            return 1;
            // Jika n lebih dari 1, hitung nilai Fibonacci dengan rekursi
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    // Metode untuk menghasilkan deret Fibonacci dengan jumlah elemen tertentu
    public static int[] generateFibonacciSequence(int numTerms) {
        // Inisialisasi array untuk menyimpan deret Fibonacci
        int[] fibSequence = new int[numTerms];

        // Iterasi untuk menghitung setiap nilai Fibonacci dan menyimpannya di array
        for (int i = 0; i < numTerms; i++) {
            fibSequence[i] = fibonacciRecursive(i);
        }

        // Mengembalikan array yang berisi deret Fibonacci
        return fibSequence;
    }

    // Metode utama yang dieksekusi saat program dijalankan
    public static void main(String[] args) {
        // Jumlah elemen dalam deret Fibonacci yang akan dihasilkan
        int numTerms = 10;

        // Menghasilkan deret Fibonacci
        int[] fibSequence = generateFibonacciSequence(numTerms);

        // Mencetak deret Fibonacci
        System.out.print("Deret Fibonacci dengan " + numTerms + " bilangan: ");
        for (int num : fibSequence) {
            System.out.print(num + " ");
        }
    }
}
