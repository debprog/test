import java.io.*;

import java.util.*;

public class fractionsum {

    static int getgcd(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0)

                gcd = i;
        }

        return gcd;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("numerator1");
        int n1 = sc.nextInt();

        System.out.println("denominator1");
        int d1 = sc.nextInt();

        System.out.println("numerator2");
        int n2 = sc.nextInt();

        System.out.println("denominator2");
        int d2 = sc.nextInt();

        int hcf = getgcd(d1, d2);

        int lcm = (d1 * d2) / hcf;

        int finnum = n1 * (lcm / d1) + n2 * (lcm / d2);

        System.out.print(finnum / (getgcd(finnum, lcm)) + "/" + lcm / ((getgcd(finnum, lcm))));

    }
}
