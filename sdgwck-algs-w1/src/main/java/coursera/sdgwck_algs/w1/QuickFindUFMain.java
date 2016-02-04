package coursera.sdgwck_algs.w1;

import java.util.Scanner;

public class QuickFindUFMain {

    /**
     * Reads number of objects from standard input then repeatedly reads pairs
     * of integers and if they are not connected, connects them and prints out
     * pair.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        UF uf = new QuickFindUF(n);
        while (in.hasNextInt()) {
            int p = in.nextInt();
            int q = in.nextInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
        in.close();
    }

}
