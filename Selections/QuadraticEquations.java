package JavaBasics.Selections;

import java.util.Scanner;

/*

b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
 */
public class QuadraticEquations {

    public static void main(String[] args) {
    double a,b,c;
    Scanner scanner = new Scanner(System.in);
        System.out.print("value of a:");
    a = scanner.nextDouble();
        System.out.print("value of b:");
    b = scanner.nextDouble();
        System.out.print("value of c:");
    c = scanner.nextDouble();

       double discriminant = Math.pow(b,2) - 4*a*c;
       double r1,r2;

            if (discriminant < 0.0) {
                System.out.println("Has No real root");
            } else if (discriminant == 0.0) {
                r1 = -b / 2 * a;
                System.out.println("Has one root: " + r1);
            } else{
                r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
                r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
                 System.out.println("the roots are: " + r1 + " and " + r2);
        }

    }

}
