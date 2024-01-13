import java.io.*;

import java.util.*;

public class sumof2prime {

    static boolean isPrime(int n) {
        int flag = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }

        }

        if (flag == 1)
            return false;

        else
            return true;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.74");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println("can be expressed");
                break;
            }

            else {
                System.out.println("cannot be expressed");
                break;

            }

        }
    }
}
