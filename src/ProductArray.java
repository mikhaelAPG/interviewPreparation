import java.util.ArrayList;
import java.util.List;

public class ProductArray {

    /**
     * Menghitung produk dari semua elemen dalam array kecuali elemen pada indeks saat ini.
     *
     * @param products Array bilangan bulat yang produk dari elemen-elemen kecuali elemen saat ini ingin dihitung.
     * @return List yang berisi produk dari semua elemen kecuali elemen pada indeks saat ini.
     */
    public static List<Integer> getProducts(int[] products) {
        // Membuat daftar untuk menyimpan hasil produk
        List<Integer> finalProducts = new ArrayList<>();
        int n = products.length;  // Menyimpan panjang array

        // Loop untuk setiap elemen dalam array
        for (int i = 0; i < n; i++) {
            int current = 1;  // Inisialisasi produk saat ini dengan 1
            // Loop untuk menghitung produk dari semua elemen kecuali elemen pada indeks i
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    current *= products[j];  // Kalikan dengan elemen lain
                }
            }
            finalProducts.add(current);  // Tambahkan hasil produk ke daftar
        }
        return finalProducts;  // Mengembalikan daftar hasil produk
    }

    public static void main(String[] args) {
        int[] products = {1, 7, 3, 4};  // Array contoh
        List<Integer> productList = getProducts(products);  // Mendapatkan daftar produk
        System.out.println(productList);  // Output: [84, 12, 28, 21]
    }
}
