package coursera.sdgwck_algs.w1.analysis;

import java.util.Scanner;

import coursera.sdgwck_algs.tools.StopWatch;

public class ConcatenationVsStringbuilder {
    
    private static void runRuner(String name, Runnable runner, int repeat) {
        StopWatch sw = new StopWatch(name + " running " + repeat + " times");
        for (int i = 0; i < repeat; ++i) {
            runner.run();
        }
        sw.stopMS();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Multiplier: ");
        int multiplier = in.nextInt();
        in.close();
        
        String[] words = {"one", "two", "three", "four", "five", "six", "seven",  "eight", "nine", "ten"};
        String[] wordsBig = new String[words.length * multiplier];
        for (int i = 0; i < words.length; ++i) {
            for (int j = 0; j < multiplier; ++j) {
                wordsBig[(j * words.length) + i] = words[i];
            }
        }
        
        runRuner("Concatenation", () -> {
            @SuppressWarnings("unused")
            String r = "";
            for (String s : wordsBig) {
                r += s;
            }
        }, 1000);
        
        runRuner("StringBuilder", () -> {
            StringBuilder sb = new StringBuilder();
            for (String s : wordsBig) {
                sb.append(s);
            }
        }, 1000);
    }
}
