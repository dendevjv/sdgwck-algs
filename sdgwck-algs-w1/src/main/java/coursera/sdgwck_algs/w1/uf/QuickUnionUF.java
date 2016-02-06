package coursera.sdgwck_algs.w1.uf;

public class QuickUnionUF extends UF  {

    public QuickUnionUF(int n) {
        super(n);
    }

    @Override
    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        id[pRoot] = qRoot;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    protected int root(int i) {
        while (id[i] != i) {
            i = id[i];
        }
        return i;
    }
}
