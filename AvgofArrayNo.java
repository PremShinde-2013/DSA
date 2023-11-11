public class AvgofArrayNo {
    public static void main(String[] args) {
        double[] arr = { 2.5, 4.6, 6.2, 7, 8, 4, 5, 777 };
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }

        double avg = sum / arr.length;

        System.out.println(avg);

    }
}
