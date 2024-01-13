import java.io.*;
import java.util.*;

public class possubstring {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1 = sc.nextLine();

        System.out.println("Enter string 2");
        String s2 = sc.nextLine();

        System.out.println(s1.indexOf(s2));

    }

}
