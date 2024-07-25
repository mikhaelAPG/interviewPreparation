public class CountWords {
    public static int countWords(String sentence) {
        // Memecah kalimat berdasarkan spasi dan menghitung jumlah kata
        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "Halo, nama saya John Doe";
        int count = countWords(sentence);
        System.out.println(count);  // Output: 5
    }
}
