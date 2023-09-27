public class BitOddOrEven {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even num
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(0);
        oddOrEven(3);
        oddOrEven(123456);

    }
}
