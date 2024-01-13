
import java.io.*;
import java.util.*;

public class min2sum {

    public static void main(String[] args) {
        int arr[] = { 5, 3, 0, 7, 4 };

        Arrays.sort(arr);
        String n1 = "", n2 = "";
        for (int i = 0; i < arr.length; i += 2) {
            n1 = n1 + Integer.toString(arr[i]);
        }

        for (int i = 1; i < arr.length; i += 2) {
            n2 = n2 + Integer.toString(arr[i]);
        }

        int s = Integer.parseInt(n2) + Integer.parseInt(n1);

        System.out.println(s);

    }

}
