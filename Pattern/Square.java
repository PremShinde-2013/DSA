// class Square {
//     public static void main(String[] args) {
//         // 5*5 box
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }




/**
 * Square
 */
 class Square {

    public static void main(String[] args) {
        int n = 6;
     
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}