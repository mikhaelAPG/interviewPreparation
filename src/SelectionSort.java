public class SelectionSort {

    /**
     * Mengurutkan array menggunakan algoritma Selection Sort.
     *
     * @param array Array bilangan bulat yang akan diurutkan.
     * @return Array yang telah diurutkan.
     */
    public static int[] selectionSort(int[] array) {
        // Loop melalui setiap elemen dalam array
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;  // Menganggap elemen saat ini adalah yang terkecil

            // Mencari elemen terkecil dalam sub-array yang tersisa
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;  // Memperbarui indeks terkecil jika ditemukan elemen yang lebih kecil
                }
            }

            // Menukar elemen saat ini dengan elemen terkecil yang ditemukan
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;  // Mengembalikan array yang telah diurutkan
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};  // Array contoh yang akan diurutkan
        int[] sortedArr = selectionSort(arr);  // Memanggil metode selectionSort untuk mengurutkan array

        // Menampilkan hasil array yang telah diurutkan
        System.out.print("Sorted array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();  // Mencetak baris baru setelah menampilkan array
    }
}
