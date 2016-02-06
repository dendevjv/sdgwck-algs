package coursera.sdgwck_algs.w1;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickUnionWeightedUFTest {

    @Test
    public void testUnion() {
        QuickUnionWeightedUF uf = new QuickUnionWeightedUF(10);
        
        assertFalse(uf.connected(3, 4));
        uf.union(3, 4);
        assertTrue(uf.connected(3, 4));
        
        assertFalse(uf.connected(3, 8));
        uf.union(3, 8);
        assertTrue(uf.connected(3, 8));
        assertTrue(uf.connected(3, 4));
        
        assertFalse(uf.connected(3, 9));
        uf.union(4, 9);
        assertTrue(uf.connected(8, 9));
        
        uf.union(0, 5);
        uf.union(0, 6);
        assertFalse(uf.connected(3, 0));
        uf.union(8, 6);
        assertTrue(uf.connected(3, 0));
        assertTrue(uf.connected(9, 5));
    }

}
