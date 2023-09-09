public class HollowRectangle {
    // public static void main(String[] args) {
    // int n = 4;
    // int m = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= m; j++) {
    // if (i == 1 || j == 1 || i == n || j == m) {
    // System.out.print("*");
    // } else {

    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    public static void PrintHollow(int row, int col) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        PrintHollow(5, 7);
    }
}
