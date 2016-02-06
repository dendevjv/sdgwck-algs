package coursera.sdgwck_algs.w1.uf;

import java.util.Arrays;

public class QuickUnionWeightedUF extends QuickUnionUF {
    private int[] sizes;

    public QuickUnionWeightedUF(int n) {
        super(n);
        sizes = new int[n];
        Arrays.fill(sizes, 1);
    }

    @Override
    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        if (sizes[pRoot] < sizes[qRoot]) {
            id[pRoot] = qRoot;
            sizes[qRoot] += sizes[pRoot];
        } else {
            id[qRoot] = pRoot;
            sizes[pRoot] += sizes[qRoot];
        }
    }

}
