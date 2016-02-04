package coursera.sdgwck_algs.w1;

/**
 * Base class for union-find data structure.
 */
public abstract class UF {
    protected int[] id;
    
    /** Initialize union-find data structure with n objects (0 to n - 1). */
    public UF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }
    
    /** Add connection between p and q. */
    public abstract void union(int p, int q);
    
    /** Checks whether p and q are in the same component. */
    public abstract boolean connected(int p, int q);
    
    /** Component identifier for p (0 to n - 1). */
    public int find(int p) {
        return -1;
    }

    /** Returns number of components. */
    public int count() {
        return -1;
    }
}
