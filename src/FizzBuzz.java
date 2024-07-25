public class FizzBuzz {

    public static void main(String[] args) {
        // Loop dari 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            // Memeriksa apakah i adalah kelipatan dari 3 dan 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Memeriksa apakah i adalah kelipatan dari 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Memeriksa apakah i adalah kelipatan dari 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Jika tidak memenuhi salah satu kondisi di atas, mencetak angka i
            else {
                System.out.println(i);
            }
        }
    }
}
