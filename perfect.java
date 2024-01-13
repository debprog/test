
import java.io.*;
import java.util.*;

public class perfect {

    public static void main(String args[]) {

        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }

        if (s == n) {
            System.out.println("perfect");
        } else {
            System.out.println("not perfect");
        }
    }

}
