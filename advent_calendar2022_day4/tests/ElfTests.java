import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElfTests {
    @Test
    void shouldIdentifySectionsFrom2To4() {
        Elf elf = new Elf("2-4");
        assertTrue(elf.isOneOfElfSections(3));
    }

    @Test
    void shouldIdentifyFirstAndLastSections() {
        Elf elf = new Elf("2-4");
        assertEquals(2, elf.getFirstSection());
        assertEquals(4, elf.getLastSection());
    }
}
