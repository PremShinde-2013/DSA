import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Coeff a");
        double a = sc.nextDouble();

        System.out.println("coeff b");
        double b = sc.nextDouble();

        System.out.println("coeff c");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {

            double root1 = -b + Math.sqrt(discriminant) / 2 * a;
            double root2 = -b - Math.sqrt(discriminant) / 2 * a;

            System.out.println("root1 : " + root1 + "  root2 : " + root2);
        } else if (discriminant == 0) {

            double root1 = -b / 2 * a;
            System.out.println(root1);

        }

        else {
            System.out.println("  imagnary //// complex roots");

            double realPart = -b / 2 * a;
            double imagneryPart = Math.sqrt(Math.abs(discriminant)) / 2 * a;

            System.out.println("real Part : " + realPart + "  Imagenery part : " + imagneryPart);

        }

    }
}
