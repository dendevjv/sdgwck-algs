package coursera.sdgwck_algs.w1.analysis;

import java.util.Arrays;
import java.util.Scanner;

import coursera.sdgwck_algs.tools.StopWatch;

public class ThreeSumOpt {

    public static void main(String[] args) {
        int[] intArray;
        if (args != null && args.length > 0) {
            edu.princeton.cs.algs4.In in = new edu.princeton.cs.algs4.In(args[0]);
            intArray = in.readAllInts();
            
            StopWatch sw = new StopWatch("3-Sum Optimized");
            zeroSum3(intArray);
            sw.stopMS();
        } else {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            intArray = new int[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = scanner.nextInt();
            }
            scanner.close();
            
            StopWatch sw = new StopWatch("3-Sum Optimized");
            zeroSum3Verbose(intArray);
            sw.stopMS();
        }
    }
    
    private static void zeroSum3(int[] a) {
        int count = 0;
        Arrays.sort(a);
        
        /* For each pair a[i] and a[j], binary search for -(a[i] + a[j]) */
        int iBound = a.length - 2;
        int jBound = a.length - 1;
        for (int i = 0; i < iBound; ++i) {
            for (int j = i + 1; j < jBound; ++j) {
                int value = a[i] + a[j];
                int r = binarySearch(-value, a, j + 1, a.length - 1);
                if (r >= 0) {
                    ++count;
                }
            }
        }
        
        System.out.println(count);
    }
    
    private static void zeroSum3Verbose(int[] a) {
        int count = 0;
        // Sort numbers
        Arrays.sort(a);
        
        // For each pair a[i] and a[j], binary search for -(a[i] + a[j])
        int iBound = a.length - 2;
        int jBound = a.length - 1;
        for (int i = 0; i < iBound; ++i) {
            for (int j = i + 1; j < jBound; ++j) {
                int value = a[i] + a[j];
                int r = binarySearch(-value, a, j + 1, a.length - 1);
                if (r >= 0) {
                    System.out.printf("%d + %d + %d = 0%n", a[i], a[j], -value);
                    ++count;
                }
            }
        }
        
        System.out.println(count);
    }

    private static int binarySearch(int value, int[] a, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = a[mid];
            if (value < midVal) {
                end = mid - 1;
            } else if (midVal < value) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -(start + 1);
    }
}
