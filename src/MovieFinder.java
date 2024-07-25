public class MovieFinder {

    /**
     * Menentukan apakah ada dua film dengan durasi yang jika dijumlahkan sama dengan panjang penerbangan.
     *
     * @param flightLength Panjang penerbangan yang harus dicapai dengan menjumlahkan durasi dua film
     * @param movieLengths Array yang berisi durasi film
     * @return True jika ada dua film yang durasinya jika dijumlahkan sama dengan flightLength, sebaliknya False
     */
    public static boolean hasPairWithSum(int flightLength, int[] movieLengths) {
        int nMovies = movieLengths.length;

        // Loop untuk memeriksa semua pasangan film
        for (int i = 0; i < nMovies; i++) {
            for (int j = 0; j < nMovies; j++) {
                // Memeriksa apakah dua film berbeda dan jika durasi kedua film dijumlahkan sama dengan panjang penerbangan
                if (i != j && movieLengths[i] + movieLengths[j] == flightLength) {
                    return true; // Pasangan ditemukan, kembalikan True
                }
            }
        }
        return false; // Tidak ada pasangan yang ditemukan, kembalikan False
    }

    public static void main(String[] args) {
        // Mendefinisikan array durasi film
        int[] movieLengths = {1, 7, 3, 4};
        // Mendefinisikan panjang penerbangan yang harus dicapai
        int flightLength = 7;
        // Menampilkan hasil ke konsol
        System.out.println(hasPairWithSum(flightLength, movieLengths));  // Output: True
    }
}
