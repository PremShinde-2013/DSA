public class LargestInArray {

    public static int Largest(int numbers[]) {
        int Largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
                Largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value " + smallest);
        return Largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 5, 6, 7, 5, 9, 22 };

        System.out.println("largest value is " + Largest(numbers));
    }
}
