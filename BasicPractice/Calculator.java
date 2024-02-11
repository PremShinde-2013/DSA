import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");

        double num1 = sc.nextDouble();

        System.out.println("ENter Second Number");

        double num2 = sc.nextDouble();

        System.out.println("Enter Operation (+  ,  -  , / , *) :  ");
        char operator = sc.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                if (num2 == 0) {
                    System.out.println("Denominator cannot be 0");
                } else {

                    result = num1 / num2;
                }

                break;

            default:
                System.out.println("Enter valid operation");
                break;
        }

        System.out.println(result);
        sc.close();

    }

}
