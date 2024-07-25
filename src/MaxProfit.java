public class MaxProfit {

    /**
     * Menghitung keuntungan maksimum yang dapat diperoleh dari membeli dan menjual saham
     * berdasarkan array harga saham pada hari sebelumnya.
     *
     * @param prices Array yang berisi harga saham pada setiap menit setelah pasar dibuka
     * @return Keuntungan maksimum yang bisa didapatkan dari 1 pembelian dan 1 penjualan
     */
    public static int getMaxProfit(int[] prices) {
        // Inisialisasi variabel untuk menyimpan keuntungan maksimum
        int maxProfit = 0;

        // Iterasi melalui setiap kemungkinan hari pembelian
        for (int i = 0; i < prices.length; i++) {
            // Iterasi melalui setiap kemungkinan hari penjualan setelah hari pembelian
            for (int j = i + 1; j < prices.length; j++) {
                // Menghitung keuntungan jika membeli pada hari i dan menjual pada hari j
                int currentProfit = prices[j] - prices[i];

                // Memperbarui keuntungan maksimum jika keuntungan saat ini lebih besar
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        // Mengembalikan keuntungan maksimum yang ditemukan
        return maxProfit;
    }

    public static void main(String[] args) {
        // Mendefinisikan array harga saham kemarin untuk diuji
        int[] stockPricesYesterday = {10, 7, 5, 8, 11, 9, 1};

        // Menampilkan keuntungan maksimum yang bisa didapatkan ke konsol
        System.out.println(getMaxProfit(stockPricesYesterday));  // Output: 6
    }
}
