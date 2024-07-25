public class PrintEvenNumbers {
    public static void main(String[] args) {
        // Inisialisasi variabel i dengan nilai 1
        int i = 1;

        // Loop selama i kurang dari atau sama dengan 20
        while (i <= 20) {
            // Memeriksa apakah i adalah angka genap
            if (i % 2 == 0) {
                // Mencetak angka genap ke konsol
                System.out.println(i);
            }
            // Menambahkan 1 ke i pada setiap iterasi
            i++;
        }
    }
}
