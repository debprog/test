import java.io.*;
import java.util.*;

public class pallindromeNo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        while (n > 0) {
            int d = n % 10;
            p = p * 10 + d;
            n = n / 10;
        }
        System.out.println(p);
    }
}
