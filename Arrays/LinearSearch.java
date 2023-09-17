public class LinearSearch {
    public static int LinearSearchNo(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5, 64, 3, 67, 55 };
        int key = 123;

        int index = LinearSearchNo(numbers, key);

        if (index == -1) {
            System.out.println("Not FOund");
        } else {
            System.out.println("found");
        }
    }
}
