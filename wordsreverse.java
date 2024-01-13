import java.io.*;
import java.util.*;

public class wordsreverse {

    public static void main(String args[]) {
        System.out.println("Enter sentence");

        Scanner sc = new Scanner(System.in);

        String sent = sc.nextLine();

        String words[] = sent.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i] + ",");
        }
    }

}
