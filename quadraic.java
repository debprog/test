
import java.io.*;
import java.util.*;

public class quadraic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,");
        double a = sc.nextDouble();

        System.out.println("Enter b");
        double b = sc.nextDouble();

        System.out.println("Enter c");
        double c = sc.nextDouble();

        double disc = Math.pow(b, 2) - 4 * a * c;

        double r1 = 0.0, r2 = 0.0;

        if (disc > 0) {
            System.out.print((-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a) + " , ");
            System.out.print((-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
        }

        else if (disc == 0) {

            System.out.print((-b / (2 * a)) + " ,");
            System.out.print((-b / (2 * a)));

        }

        else {
            System.out.println((-b / (2 * a)) + (Math.sqrt((Math.pow(b, 2) - 4 * a * c)) / (2 * a)) + "i");
            System.out.println((-b / (2 * a)) - (Math.sqrt((Math.pow(b, 2) - 4 * a * c)) / (2 * a)) + "i");
        }

    }
}
