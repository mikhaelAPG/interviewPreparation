public class DecimalToBinary {

    /**
     * Mengonversi bilangan desimal menjadi bilangan biner menggunakan rekursi.
     *
     * @param n Bilangan desimal yang akan dikonversi
     * @return String representasi biner dari bilangan desimal dengan prefix "0b"
     */
    public static String decimalToBinary(int n) {
        // Basis kasus: jika n adalah 0, kembalikan "0b0"
        if (n == 0) {
            return "0b0";
        } else {
            // Rekursif: bagi n dengan 2 dan tambahkan sisa pembagian n % 2
            // String hasil rekursi dipanggil pada n / 2 ditambah sisa (n % 2)
            // Menggabungkan hasil rekursi dengan digit biner saat ini
            return decimalToBinary(n / 2) + (n % 2);
        }
    }

    public static void main(String[] args) {
        // Menampilkan hasil konversi bilangan desimal 222 ke biner
        System.out.println(decimalToBinary(222));  // Output: 0b11011110

        // Menampilkan hasil konversi bilangan desimal 10 ke biner
        System.out.println(decimalToBinary(10));   // Output: 0b1010

        // Menampilkan hasil konversi bilangan desimal 0 ke biner
        System.out.println(decimalToBinary(0));    // Output: 0b0

        // Menampilkan hasil konversi bilangan desimal 42 ke biner
        System.out.println(decimalToBinary(42));   // Output: 0b101010
    }
}
