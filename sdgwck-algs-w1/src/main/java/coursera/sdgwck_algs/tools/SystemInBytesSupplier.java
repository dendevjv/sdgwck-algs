package coursera.sdgwck_algs.tools;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SystemInBytesSupplier implements AutoCloseable {
    private InputStream savedIn;
    
    public SystemInBytesSupplier(String input) {
        byte[] buffer = input.getBytes();
        savedIn = System.in;
        System.setIn(new ByteArrayInputStream(buffer));
    }

    @Override
    public void close() throws Exception {
        System.setIn(savedIn);
    }

}
