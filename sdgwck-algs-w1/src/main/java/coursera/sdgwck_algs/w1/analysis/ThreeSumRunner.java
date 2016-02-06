package coursera.sdgwck_algs.w1.analysis;

import coursera.sdgwck_algs.tools.SystemInBytesSupplier;

public class ThreeSumRunner {
    public static void main(String[] args) {
        String nl = System.lineSeparator();
        String input = "8" + nl + "30 -40 -20 -10 40 0 10 5";
        try (SystemInBytesSupplier supp = new SystemInBytesSupplier(input );) {
            ThreeSum.main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
