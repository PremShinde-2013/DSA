public class SwapWithoutTemporary {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        System.out.println("before  " + a + b);

        a = a + b; // 3
        b = a - b; // 2
        a = a - b; // 1

        System.out.println("a = " + a + "   " + "b = " + b);

    }
}
