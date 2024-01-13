import java.io.*;
import java.util.*;

class abc {

    static boolean isSubset(int arr1[], int arr2[]) {

        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            h.add(arr2[i]);

        }

        for (int i = 0; i < arr1.length; i++) {
            if (!h.contains(arr1[i])) {
                return false;
            }

        }

        return true;

    }

    public static void main(String args[]) {

        int a[] = { 4, 5 };
        int b[] = { 1, 2, 3, 4, 5 };

        System.out.println(isSubset(a, b));

    }
}
