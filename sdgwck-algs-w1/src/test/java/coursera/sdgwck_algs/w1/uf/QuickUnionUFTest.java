package coursera.sdgwck_algs.w1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuickUnionUFTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUnion() {
        QuickUnionUF uf = new QuickUnionUF(10);
        
        assertFalse(uf.connected(0, 9));
        uf.union(0, 9);
        assertTrue(uf.connected(0, 9));
        
        assertFalse(uf.connected(0, 8));
        assertFalse(uf.connected(9, 8));
        uf.union(0, 8);
        assertTrue(uf.connected(0, 8));
        assertTrue(uf.connected(9, 8));
    }

}
