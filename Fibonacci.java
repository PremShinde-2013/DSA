public class Fibonacci {

    // 0,1,1,2,3,5,8
    public static void main(String[] args) {

        int n = 10, firstNo = 0, secondNo = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(firstNo + " , ");

            int nextNo = firstNo + secondNo; // 2
            firstNo = secondNo; // 1
            secondNo = nextNo; // 2

        }

    }
}
