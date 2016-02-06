package coursera.sdgwck_algs.w1.uf;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Test;

import coursera.sdgwck_algs.tools.ResourceReader;
import coursera.sdgwck_algs.tools.SystemInBytesSupplier;
import coursera.sdgwck_algs.tools.SystemOutTester;
import coursera.sdgwck_algs.w1.uf.QuickUnionUFMain;

public class QuickUnionUFMainTest {

    @Test
    public void testMain() {
        try (
                InputStream inputStream = getClass().getResourceAsStream("/test01input.txt");
                SystemInBytesSupplier supplier = new SystemInBytesSupplier(inputStream);
                SystemOutTester out = new SystemOutTester()) {
            QuickUnionUFMain.main(null);
            String expected = ResourceReader.readAsText(this.getClass(), "/test01expected.txt");
            String actual = out.getOutput();
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: " + e);
        }
    }

}
