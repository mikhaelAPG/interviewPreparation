public class FilterAndPrintEvenNumber {

    // Metode utama yang dieksekusi saat program dijalankan
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array angka
        int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        // Memanggil metode createOutput untuk menghasilkan string keluaran
        String output = createOutput(numbers);

        // Mencetak string keluaran ke konsol
        System.out.println(output);
    }

    // Metode untuk membuat string keluaran dari angka-angka genap dalam array
    private static String createOutput(int[] numbers) {
        // Inisialisasi string keluaran dengan tanda awal "-"
        String output = "-";

        // Iterasi melalui setiap angka dalam array
        for (int number : numbers) {
            // Memeriksa apakah angka tersebut genap
            if (number % 2 == 0) {
                // Jika genap, tambahkan angka tersebut ke string keluaran dengan tanda "*"
                output += "*" + number;
            }
        }

        // Menambahkan tanda akhir "*" dan "-" ke string keluaran
        output += "*-";

        // Mengembalikan string keluaran
        return output;
    }
}
