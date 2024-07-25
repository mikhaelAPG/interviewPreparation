import java.util.ArrayList;
import java.util.List;

public class MergeLists {

    /**
     * Menggabungkan dua daftar integer yang sudah terurut menjadi satu daftar yang terurut.
     *
     * @param myList Daftar pertama yang terurut
     * @param alicesList Daftar kedua yang terurut
     * @return Daftar baru yang berisi elemen dari kedua daftar dalam urutan terurut
     */
    public static List<Integer> merge(int[] myList, int[] alicesList) {
        // Mendapatkan panjang dari kedua daftar
        int myLen = myList.length;
        int aliceLen = alicesList.length;

        // Inisialisasi pointer untuk kedua daftar
        int myPointer = 0;
        int alicePointer = 0;

        // Daftar hasil yang akan menyimpan elemen yang digabungkan
        List<Integer> result = new ArrayList<>();

        // Menggabungkan elemen dari kedua daftar selama ada elemen di kedua daftar
        while (myPointer < myLen && alicePointer < aliceLen) {
            // Menambahkan elemen yang lebih kecil ke daftar hasil
            if (myList[myPointer] < alicesList[alicePointer]) {
                result.add(myList[myPointer++]);
            } else {
                result.add(alicesList[alicePointer++]);
            }
        }

        // Menambahkan sisa elemen dari daftar pertama jika ada
        while (myPointer < myLen) {
            result.add(myList[myPointer++]);
        }

        // Menambahkan sisa elemen dari daftar kedua jika ada
        while (alicePointer < aliceLen) {
            result.add(alicesList[alicePointer++]);
        }

        // Mengembalikan daftar yang telah digabungkan
        return result;
    }

    public static void main(String[] args) {
        // Mendefinisikan dua daftar yang terurut untuk diuji
        int[] myList = {3, 4, 6, 10, 11, 15};
        int[] alicesList = {1, 5, 8, 12, 14, 19};

        // Menggabungkan kedua daftar dan menyimpan hasilnya di daftar baru
        List<Integer> mergedList = merge(myList, alicesList);

        // Menampilkan daftar yang telah digabungkan ke konsol
        System.out.println(mergedList);
    }
}
