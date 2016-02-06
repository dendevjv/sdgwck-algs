package coursera.sdgwck_algs.w1.uf;

public class QuickFindUF extends UF {
    
    public QuickFindUF(int n) {
        super(n);
    }
    
    /** Checks whether p and q are in the same component. */
    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    
    /** Add connection between p and q. */
    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
