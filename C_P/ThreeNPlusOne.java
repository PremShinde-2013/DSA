package C_P;
public class ThreeNPlusOne {
    public static void main(String[] args) {
      
        int n = 22;
        int count = 0;
System.out.print(n+ " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count = count + 1;
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("total no of iterations : " + count);
    }
}
