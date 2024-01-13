import java.io.*;
import java.util.*;

public class ChangeCase {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");

        String s = sc.nextLine();
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii_ch = (int) ch;

            if (ascii_ch >= 65 && ascii_ch <= 90) {
                ch = Character.toLowerCase(ch);
            }

            else if (ascii_ch >= 97 && ascii_ch <= 122) {
                ch = Character.toUpperCase(ch);
            }

            s1 = s1 + ch;

        }

        System.out.println(s1);
    }
}
