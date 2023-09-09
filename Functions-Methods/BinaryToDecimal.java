public class BinaryToDecimal {

    public static void binToDec(int binNum) {
        int pow = 0;
        int dec = 0;
        int ld = 0;

        while (binNum > 0) {
            ld = binNum % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(dec);
    }

    public static void main(String[] args) {

        binToDec(100000001);
    }
}
