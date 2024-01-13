import java.io.*;

import java.util.*;

public class armstrong {

    public static void main(String args[]) {
        System.out.println("enter the no.");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String sn = String.valueOf(n);
        int d = sn.length();
        int s = 0, p = 0, a = 0;
        while (n != 0) {
            a = n % 10;
            p = (int) Math.pow(a, d);
            s = s + p;
            n = n / 10;
        }

        if (s == n)
            System.out.println("pallindrome");
        else
            System.out.println("not pallindrome");
    }
}
