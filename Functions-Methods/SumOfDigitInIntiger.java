import java.util.Scanner;

public class SumOfDigitInIntiger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int digits = sc.nextInt();
        System.out.println("The Sum is " + sumDigit(digits));
    }

    public static int sumDigit(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n = n / 10;
        }
        return sumOfDigits;

    }

}
