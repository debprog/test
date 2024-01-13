import java.io.*;
import java.util.*;

public class equilibrium {

    static int findequilibrium(int arr1[]) {
        int n1 = arr1.length;

        int front[] = new int[n1];
        int s1 = 0;
        for (int i = 0; i < n1; i++) {
            s1 = s1 + arr1[i];
            front[i] = s1;
        }

        int back[] = new int[n1];
        s1 = 0;
        for (int i = n1 - 1; i >= 0; i--) {
            s1 = s1 + arr1[i];
            back[i] = s1;
        }

        // for (int i = 0; i < n1; i++) {
        // System.out.print(front[i] + " ");

        // }

        for (int i = 0; i < n1; i++) {
            if (front[i] == back[i]) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, -1, 8, 4 };

        System.out.println(findequilibrium(nums));
    }

}
