public class InvertedHalfPyramid180 {
    // public static void main(String[] args) {
    // int n = 4;
    // for (int i = 1; i <= n; i++) {

    // // to print space
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // to print star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }

    public static void inverted_pyramid_180D(int n) {

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // to print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        inverted_pyramid_180D(10);
    }
}
