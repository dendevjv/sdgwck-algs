package coursera.sdgwck_algs.tools;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class SystemInBytesSupplierTest {

    @Test
    public void testSystemInBytesSupplier() {
        try (
                SystemInBytesSupplier in = new SystemInBytesSupplier("1 2 3");
                SystemOutTester out = new SystemOutTester();) {
                multiplyBy(100);
                String actual = out.getOutput();
                assertEquals("100200300", actual);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: " + e);
        }
    }

    private static void multiplyBy(int m) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.print(n * m);
        }
        in.close();
    }
}
