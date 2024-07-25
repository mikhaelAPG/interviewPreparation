import java.util.HashMap;
import java.util.Map;

public class MostFrequentLetter {

    /**
     * Menentukan huruf yang paling sering muncul dalam sebuah string.
     *
     * @param word String yang akan diproses untuk menemukan huruf yang paling sering muncul
     * @return Huruf yang paling sering muncul dalam string
     */
    public static char mostFrequentLetter(String word) {
        // Menggunakan HashMap untuk menyimpan jumlah kemunculan setiap huruf
        Map<Character, Integer> lettersCount = new HashMap<>();

        // Menghitung kemunculan setiap huruf dalam string
        for (char letter : word.toCharArray()) {
            // Mengupdate jumlah kemunculan huruf di HashMap
            lettersCount.put(letter, lettersCount.getOrDefault(letter, 0) + 1);
        }

        // Inisialisasi variabel untuk menyimpan huruf yang paling sering muncul dan jumlah kemunculannya
        char mostFrequent = ' ';
        int maxCount = 0;

        // Menentukan huruf yang paling sering muncul dengan memeriksa setiap entri dalam HashMap
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            // Memperbarui huruf yang paling sering muncul jika jumlah kemunculan lebih besar dari maxCount
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // Mengembalikan huruf yang paling sering muncul
        return mostFrequent;
    }

    public static void main(String[] args) {
        // Mendefinisikan string untuk diuji
        String word = "hello";

        // Menampilkan huruf yang paling sering muncul ke konsol
        System.out.println(mostFrequentLetter(word));  // Output: l
    }
}
