import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter Fahrenheit Value");
        double F = sc.nextDouble();

        double Celsius = (F - 32) / 1.8;

        System.out.println("Celsius value is : " + Celsius);

    }
}
