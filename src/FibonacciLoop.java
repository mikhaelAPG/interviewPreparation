public class FibonacciLoop {

    public static void main(String[] args) {
        int numTerms = 0;

        if (numTerms <= 0) {
            System.out.println("Masukkan angka yang lebih besar dari 0");
        } else {
            int a = 0;
            int b = 1;

            int[] fibSequence = new int[numTerms];

            for (int i = 0; i < numTerms; i++) {
                fibSequence[i] = a;

                int temp = a + b;
                a = b;
                b = temp;
            }

            System.out.print("Deret Fibonacci dengan " + numTerms + " bilangan: ");
            for (int num : fibSequence) {
                System.out.print(num + " ");
            }
        }
    }
}
