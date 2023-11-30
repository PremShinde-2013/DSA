public class Power {
    public static void main(String[] args) {
        int base = 10;
        int exponent = 4;

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            // result *= base;
            result = result * base;
            System.out.println(result);
        }

        System.out.println(result);

    }
}
