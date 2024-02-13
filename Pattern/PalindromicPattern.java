public class PalindromicPattern {
    public static void Palindrome(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // 1st half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // 2st half numbers spaces

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Palindrome(5);
    }
}
