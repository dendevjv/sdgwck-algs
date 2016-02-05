package coursera.sdgwck_algs.w1;

import java.util.Scanner;

public class QuickUnionUFMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        UF uf = new QuickUnionUF(n);
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
