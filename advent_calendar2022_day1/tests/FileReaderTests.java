import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FileReaderTests {
    @Test
    public void readsFileCorrectly() {
        String expectedOutput = "1000\n2000\n3000\n\n4000\n\n5000\n6000\n\n7000\n8000\n9000\n\n10000";

        assertEquals(expectedOutput, FileReader.copyFileContentToString("./shortExample.txt"));
    }

    // test ramo catch
}
