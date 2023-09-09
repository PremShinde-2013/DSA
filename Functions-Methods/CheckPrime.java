public class CheckPrime {
    // only for n>=2
    // public static boolean CheckPrimeNo(int n) {

    // // corner cases
    // if (n == 2) {
    // return true;
    // }
    // // boolean isprime = true;
    // // for (int i = 2; i <= n - 1; i++) {
    // // if (n % i == 0) {
    // // isprime = false;
    // // }
    // // }
    // // return isprime;

    // // optimize way
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {

    // return false;
    // }

    // }
    // return true;

    // }

    public static boolean CheckPrimeNo(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (CheckPrimeNo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNo(16));
        primeinrange(100);
    }
}
