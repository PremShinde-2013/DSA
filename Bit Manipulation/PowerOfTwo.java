public class PowerOfTwo {

    public static boolean powerofTwoOrNot(int n) {
        return (n & (n - 1)) == 0;

    }

    public static void main(String[] args) {
        System.out.println(powerofTwoOrNot(2));

    }
}