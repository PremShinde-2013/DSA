public class FactorialOfNo {
    public static void main(String[] args) {
        int a = 4;
        int fac = 1;
        for (int i = a; i >= 1; i--) {
            fac = fac * i;
            System.out.println(i);
            System.out.println(fac);
        }
        System.out.println(fac);
    }
}
