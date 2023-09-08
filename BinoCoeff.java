public class BinoCoeff {

    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinoFacto(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);
        int bino_coeff = fact_n / (fact_r * fact_nmr);
        return bino_coeff;
    }

    public static void main(String[] args) {
        System.out.println(BinoFacto(10, 10));
    }
}
