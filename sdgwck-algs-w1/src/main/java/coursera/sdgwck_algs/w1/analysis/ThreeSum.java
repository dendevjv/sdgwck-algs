package coursera.sdgwck_algs.w1.analysis;

import java.util.Scanner;

import coursera.sdgwck_algs.tools.StopWatch;

/** 3-Sum: brute-force algorithm. */
public class ThreeSum {

    public static void main(String[] args) {
        int[] intArray;
        if (args != null && args.length > 0) {
            edu.princeton.cs.algs4.In in = new edu.princeton.cs.algs4.In(args[0]);
            intArray = in.readAllInts();
            
            StopWatch sw = new StopWatch("3-Sum brute-force");
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
            
            StopWatch sw = new StopWatch("3-Sum brute-force");
            zeroSum3Verbose(intArray);
            sw.stopMS();
        }
        
    }
    
    private static void zeroSum3(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 2; ++i) {
            for (int j = i + 1; j < a.length - 1; ++j) {
                for (int k = j + 1; k < a.length; ++k) {
                    if ((a[i] + a[j] + a[k]) == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
    private static void zeroSum3Verbose(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 2; ++i) {
            for (int j = i + 1; j < a.length - 1; ++j) {
                for (int k = j + 1; k < a.length; ++k) {
                    if ((a[i] + a[j] + a[k]) == 0) {
                        count++;
                        System.out.printf("%d + %d + %d = 0%n", a[i], a[j], a[k]);
                    }
                }
            }
        }
        System.out.println(count);
    }

}
