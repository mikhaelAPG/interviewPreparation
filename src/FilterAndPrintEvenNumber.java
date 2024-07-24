public class FilterAndPrintEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        String output = createOutput(numbers);
        System.out.println(output);
    }

    private static String createOutput(int[] numbers) {
        String output = "-";
        for (int number : numbers) {
            if (number % 2 == 0) {
                output += "*" + number;
            }
        }
        output += "*-";
        return output;
    }
}
