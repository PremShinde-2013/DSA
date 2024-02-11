public class checkSorted {

    public static boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 7, 8 };

        if (checkSorted(arr)) {

            System.out.println(" Sorted");
        } else {
            System.out.println("not sorted");
        }

    }
}
