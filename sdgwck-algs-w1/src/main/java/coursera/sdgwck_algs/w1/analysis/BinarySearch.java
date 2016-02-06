package coursera.sdgwck_algs.w1.analysis;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {12, 17, 38, 98, 25, 23, 8, 2, 21, 88};
        Arrays.sort(a);
        System.out.println("Searching in array: " + Arrays.toString(a));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter key: ");
        int v = in.nextInt();
        in.close();
        int r = find(a, v);
        System.out.println("Result: " + r + ", lo=" + (-r - 1));
    }

    private static int find(int[] a, int v) {
        int lo = 0;
        int hi = a.length - 1;
        int m, midVal;
        while (lo <= hi) {
            m = lo + (hi - lo) / 2;
            midVal = a[m];
            if (midVal == v) {
                return m;
            } else if (v < midVal) {
                hi = m - 1;
            } else {
                lo = m + 1;
            }
        }
        return -(lo + 1);
    }

}
