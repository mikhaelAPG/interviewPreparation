public class FindMax {

    /**
     * Mencari angka terbesar dalam array.
     *
     * @param array Array yang berisi angka-angka untuk dicari angka terbesarnya
     * @return Angka terbesar dalam array
     */
    public static int findMax(int[] array) {
        // Menginisialisasi angka terbesar dengan elemen pertama dari array
        int maxNum = array[0];

        // Iterasi melalui setiap elemen dalam array
        for (int num : array) {
            // Jika elemen saat ini lebih besar dari angka terbesar yang diketahui, perbarui maxNum
            if (num > maxNum) {
                maxNum = num;
            }
        }
        // Mengembalikan angka terbesar yang ditemukan
        return maxNum;
    }

    public static void main(String[] args) {
        // Mendefinisikan array angka untuk diuji
        int[] arr = {1, 5, 3, 7, 2};

        // Menemukan angka terbesar dalam array menggunakan metode findMax
        int maxNum = findMax(arr);

        // Menampilkan angka terbesar ke konsol
        System.out.println(maxNum);  // Output: 7
    }
}
