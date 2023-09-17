public class Kadane_sAlgorithm {
    public static void Kadane(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max SubArray Sum is : " + ms);

    }

    public static void main(String[] args) {
        int numbers[] = { -1, -3, -4, -4, -3, -6, -5, -7, 10 };
        Kadane(numbers);

    }
}
