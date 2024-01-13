import java.io.*;
import java.util.*;

public class permuteNR {

    static int getfactorial(int a) {
        int p = 1;
        for (int i = 1; i <= a; i++) {
            p = p * i;
        }
        return p;
    }

    public static void main(String args[]) {
        int res = getfactorial(5) / getfactorial(5 - 3);

        System.out.println(res);

    }

}
