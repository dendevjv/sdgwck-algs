package coursera.sdgwck_algs.w1;

import static org.junit.Assert.*;

import org.junit.Test;

import coursera.sdgwck_algs.tools.SystemInBytesSupplier;
import coursera.sdgwck_algs.tools.SystemOutTester;

public class QuickFindUFMainTest {
    private static final String NL = System.lineSeparator();

    @Test
    public void testMain() {
        String input = "10" + NL +
                "4 3" + NL +
                "3 8" + NL +
                "6 5" + NL +
                "9 4" + NL +
                "2 1" + NL +
                "8 9" + NL +
                "5 0" + NL +
                "7 2" + NL +
                "6 1" + NL +
                "1 0" + NL +
                "6 7" + NL;
        try (SystemInBytesSupplier in = new SystemInBytesSupplier(input);
                SystemOutTester out = new SystemOutTester()) {
            QuickFindUFMain.main(null);
            String expected = "4 3" + NL +
                    "3 8" + NL +
                    "6 5" + NL +
                    "9 4" + NL +
                    "2 1" + NL +
                    "5 0" + NL +
                    "7 2" + NL +
                    "6 1" + NL;
            String actual = out.getOutput();
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: " + e);
        }
    }

}
