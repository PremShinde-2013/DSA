public class EvenOdd {

    public static boolean isEven(int n) {
        if ((n & 1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 13;

        if (isEven(n) == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
