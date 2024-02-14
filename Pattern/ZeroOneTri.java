public class ZeroOneTri {
    public static void ZOTri(int n) {
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if ((i + j) % 2 == 0) {
        //             System.out.print(1);
        //         } else {
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println();
        // }
        int spaces = 2*(n-1);
  for (int i = 1; i <=n ; i++) {
            // numbers
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            // spaces
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            // numbers

            for (int j = i; j >=1 ; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
            spaces= spaces-2;
        }
    }

    public static void main(String[] args) {
        ZOTri(5);
    }
}
