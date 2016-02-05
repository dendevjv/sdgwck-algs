package coursera.sdgwck_algs.tools;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResourceReader {
    public static String readAsText(Class<?> clazz, String resourceFileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (InputStreamReader isr = new InputStreamReader(
                new BufferedInputStream(clazz.getResourceAsStream(resourceFileName)))) {
            char[] cbuf = new char[1024];
            int numChars;
            while ((numChars = isr.read(cbuf)) != -1) {
                sb.append(cbuf, 0, numChars);
            }
        }
        return sb.toString();
    }
}
