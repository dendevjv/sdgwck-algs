package coursera.sdgwck_algs.w1;

public class QuickUnionWeightedWithPathCompressionUF extends QuickUnionWeightedUF {

    public QuickUnionWeightedWithPathCompressionUF(int n) {
        super(n);
    }

    @Override
    protected int root(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
