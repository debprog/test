import java.io.*;

public class rotatearray {

    static void reverse(int a[], int s, int e) {
        while (s <= e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }

    }

    static void lrotate(int a[], int k) {
        reverse(a, 0, k - 1);
        reverse(a, k + 1, a.length - 1);
        reverse(a, 0, a.length - 1);

    }

    static void rrotate(int a[], int k) {
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - k - 1);
        reverse(a, 0, a.length - 1);

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };

        lrotate(arr, 2);

        for (int index = 0; index < arr.length; index++) {

            System.out.print(arr[index]);

        }

        System.out.println();
        int arr1[] = { 1, 2, 3, 4, 5 };

        rrotate(arr1, 2);

        for (int index = 0; index < arr1.length; index++) {

            System.out.print(arr1[index]);

        }

    }
}
