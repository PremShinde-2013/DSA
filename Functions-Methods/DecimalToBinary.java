public class DecimalToBinary {

    public static void decToBin(int n) {

        // for binary to Decimal
        // int pow = 0;
        // int dec = 0;
        // int ld = 0;

        // while (binNum > 0) {
        // ld = binNum % 10;
        // dec = dec + (ld * (int) Math.pow(2, pow));
        // pow++;
        // binNum = binNum / 10;
        // }
        // System.out.println(dec);
        // }

        // for decimal to Binary

        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println(binNum);
    }

    public static void main(String[] args) {

        decToBin(10);

    }
}
