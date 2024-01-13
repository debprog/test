import java.io.*;
import java.util.*;

public class MostRepeatedChar {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String s = sc.nextLine();
        s = s + " ";
        int charArr[] = new int[256];
        Arrays.fill(charArr, 0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                int ascii_ch = (int) s.charAt(i);
                charArr[ascii_ch] += 1;
            }

            else {
                int high = 0;
                int ascii_high = 0;
                for (int j = 0; j < charArr.length; j++) {
                    if (charArr[j] > high) {
                        high = charArr[j];
                        ascii_high = j;
                    }
                }
                System.out.println("repeated" + (char) (ascii_high) + " " + high + "times");
                Arrays.fill(charArr, 0);

            }

        }

    }

}
