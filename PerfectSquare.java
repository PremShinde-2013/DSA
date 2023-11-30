public class PerfectSquare {
    public static void main(String[] args) {
        int num = 9;

        double squareroot = Math.sqrt(num);

        if (squareroot == Math.floor(squareroot)) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }

    }
}
