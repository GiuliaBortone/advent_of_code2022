import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectoryTests {
    @Test
    void emptyDirectoryShouldHaveDimensionZero() {
        Directory directory = new Directory(null);
        assertEquals(0, directory.calculateDimension());
    }

    @Test
    void directoryWithOneFileShouldHaveDimensionOfThatFile() {
        Directory directory = new Directory(new File(10));
        assertEquals(10, directory.calculateDimension());
    }
}
