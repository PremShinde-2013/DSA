public class LargestInArr {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 777, 6, 8, 9 };

        int large = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }

        System.out.println(large);

    }
}
