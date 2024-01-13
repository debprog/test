import java.io.*;
import java.util.*;

public class replace0by1 {

    public static void main(String args[]) {
        System.out.println("Enter a string ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String sn = String.valueOf(n);

        sn = sn.replace('0', '1');

        System.out.println(sn);
    }
}
