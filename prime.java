import java.io.*;
import java.util.*;

public class prime {

    public static void main(String args[]) {

        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(" prime");
        } else
            System.out.println("not prime");

    }
}
