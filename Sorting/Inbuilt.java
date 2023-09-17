import java.util.Arrays;
import java.util.Collections;

public class Inbuilt {

    // public static void print(int arr[]) {
    public static void print(Integer arr[]) { // for collection in reverse order
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 7, 9, 3, 5, 6, 2 };
        Integer arr[] = { 5, 7, 9, 3, 5, 6, 2 }; // for collection in reverse order
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 5);
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        print(arr);
    }
}
