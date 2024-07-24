public class FibonacciRecursive {

    public static int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static int[] generateFibonacciSequence(int numTerms) {
        int[] fibSequence = new int[numTerms];
        for (int i = 0; i < numTerms; i++) {
            fibSequence[i] = fibonacciRecursive(i);
        }
        return fibSequence;
    }

    public static void main(String[] args) {
        int numTerms = 10;

        int[] fibSequence = generateFibonacciSequence(numTerms);

        System.out.print("Deret Fibonacci dengan " + numTerms + " bilangan: ");
        for (int num : fibSequence) {
            System.out.print(num + " ");
        }
    }
}
