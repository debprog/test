import java.io.*;
import java.util.*;

public class gcd {

    public static void main(String args[]) {
        int a = 100, b = 250, gcd = 1;

        int min = Math.min(a, b);

        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}
